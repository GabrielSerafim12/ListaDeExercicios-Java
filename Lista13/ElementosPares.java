package Exercicios;

import java.util.Scanner;

public class ElementosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        int contadorPares = 0;

        // Lê os elementos do vetor e conta os pares
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) { // Verifica se o número é par
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares no vetor: " + contadorPares);

        scanner.close();
    }
}

