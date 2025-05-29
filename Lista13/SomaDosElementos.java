package Exercicios;

import java.util.Scanner;

public class SomaDosElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        int soma = 0;

        // Lê os elementos do vetor e soma ao mesmo tempo
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

        scanner.close();
    }
}
