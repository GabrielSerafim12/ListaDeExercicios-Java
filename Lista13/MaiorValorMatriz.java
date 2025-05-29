package Exercicios;

import java.util.Scanner;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maiorValor = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        // Entrada de dados
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                // Atualiza o maior valor
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Exibe o maior valor encontrado
        System.out.println("\nO maior valor na matriz é: " + maiorValor);

        scanner.close();
    }
}

