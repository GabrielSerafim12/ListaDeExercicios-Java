package Exercicios;

import java.util.Scanner;

public class TrocarLinhasMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Entrada de dados
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Troca da primeira linha com a última linha
        int[] temp = matriz[0];
        matriz[0] = matriz[2];
        matriz[2] = temp;

        // Exibe a nova matriz
        System.out.println("\nNova matriz após a troca da primeira linha com a última:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

