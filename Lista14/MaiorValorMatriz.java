package Exercicios;

import java.util.Scanner;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE; // Começa com o menor valor possível

        // Lendo os valores da matriz
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se é o maior valor até agora
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        // Exibindo o maior valor encontrado
        System.out.println("\nMaior valor da matriz: " + maior);

        scanner.close();
    }
}

