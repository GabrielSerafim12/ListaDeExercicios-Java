package Exercicios;

import java.util.Scanner;

public class VetorInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        // Lê os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Inverte o vetor
        int[] vetorInvertido = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[i] = vetor[tamanho - 1 - i];
        }

        // Exibe o vetor invertido
        System.out.print("Vetor invertido: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }

        scanner.close();
    }
}

