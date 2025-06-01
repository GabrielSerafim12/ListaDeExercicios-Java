package Exercicios;

import java.util.Scanner;

public class DiagonalPrincipal {
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

        // Exibindo a diagonal principal
        System.out.println("\nElementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "] = " + matriz[i][i]);
        }

        scanner.close();
    }
}

