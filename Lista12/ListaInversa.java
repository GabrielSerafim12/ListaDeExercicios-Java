package Exercicios;

import java.util.Scanner;

public class ListaInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        // Lê os números e armazena no vetor
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nElementos em ordem inversa:");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}

