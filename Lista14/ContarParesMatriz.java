package Exercicios;

import java.util.Scanner;

public class ContarParesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int pares = 0;

        // Lendo os valores da matriz
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se o número é par
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        // Exibindo a quantidade de números pares
        System.out.println("\nQuantidade de números pares na matriz: " + pares);

        scanner.close();
    }
}
