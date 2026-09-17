import java.util.Scanner;

public class ExerciciosJava {

    // =========================================================
    // QUESTÃO 1 - CONTAGEM DE PESSOAS MAIORES DE IDADE
    // =========================================================
    /*
     * Objetivo:
     * Ler a idade de várias pessoas e informar quantas
     * são maiores de idade.
     *
     * Conceitos utilizados:
     * - Entrada de dados
     * - Variável contadora
     * - Estrutura de repetição (for)
     * - Estrutura condicional (if)
     * - Saída de dados
     */

    public static void questao1(Scanner entrada) {

        int contador = 0;

        System.out.print("Quantas pessoas serão informadas? ");
        int quantidade = entrada.nextInt();

        // Repete o processo para cada pessoa
        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();

            // Verifica se a pessoa é maior de idade
            if (idade >= 18) {
                contador++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de idade: " + contador);
    }


    // =========================================================
    // QUESTÃO 2 - CÁLCULO DA MÉDIA COM UM MÉTODO
    // =========================================================
    /*
     * Objetivo:
     * Calcular a média de três notas utilizando um método.
     *
     * Conceitos utilizados:
     * - Método
     * - Parâmetros
     * - Tipo de retorno
     * - return
     * - Entrada de dados
     */

    public static double calcularMedia(double nota1, double nota2, double nota3) {

        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Retorna o resultado para quem chamou o método
        return media;
    }

    public static void questao2(Scanner entrada) {

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        // Chama o método e guarda o resultado
        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Média: " + media);
    }


    // =========================================================
    // QUESTÃO 3 - IDENTIFICAÇÃO DO MAIOR VALOR EM UM ARRAY
    // =========================================================
    /*
     * Objetivo:
     * Armazenar cinco valores em um array e descobrir
     * qual deles é o maior.
     *
     * Conceitos utilizados:
     * - Array
     * - Índices
     * - Estrutura de repetição (for)
     * - Estrutura condicional (if)
     * - Comparação de valores
     */

    public static void questao3(Scanner entrada) {

        // Cria um array capaz de armazenar 5 números
        int[] valores = new int[5];

        // Preenche o array com os valores digitados
        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = entrada.nextInt();
        }

        // Considera inicialmente o primeiro valor como o maior
        int maior = valores[0];

        // Percorre os outros valores procurando um maior
        for (int i = 1; i < 5; i++) {

            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
    }
