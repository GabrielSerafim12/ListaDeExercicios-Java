package Exercicios;

import java.util.Scanner;

public class SomaLinhasMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Lendo os valores da matriz
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando e exibindo a soma de cada linha
        System.out.println("\nSoma dos elementos de cada linha:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}

