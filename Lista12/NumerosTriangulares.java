package Exercicios;

import java.util.Scanner;

public class NumerosTriangulares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (N): ");
        int N = scanner.nextInt();

        System.out.println("Série de números triangulares:");

        for (int i = 1; i <= N; i++) {
            int triangular = (i * (i + 1)) / 2;
            System.out.println("Termo " + i + ": " + triangular);
        }

        scanner.close();
    }
}

