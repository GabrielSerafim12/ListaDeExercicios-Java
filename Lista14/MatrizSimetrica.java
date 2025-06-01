package Exercicios;

import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean simetrica = true;

        // Leitura dos valores da matriz
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificação de simetria
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Resultado
        if (simetrica) {
            System.out.println("\nA matriz é simétrica.");
        } else {
            System.out.println("\nA matriz NÃO é simétrica.");
        }

        scanner.close();
    }
}

