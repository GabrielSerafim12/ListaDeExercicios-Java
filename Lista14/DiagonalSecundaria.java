package Exercicios;

import java.util.Scanner;

public class DiagonalSecundaria {
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

        // Exibindo a diagonal secundária
        System.out.println("\nElementos da diagonal secundária:");
        for (int i = 0; i < 3; i++) {
            int j = 2 - i; // condição da diagonal secundária: i + j == 2
            System.out.println("Elemento [" + i + "][" + j + "] = " + matriz[i][j]);
        }

        scanner.close();
    }
}

