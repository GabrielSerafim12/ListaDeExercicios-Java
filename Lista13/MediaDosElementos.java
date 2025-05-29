package Exercicios;

import java.util.Scanner;

public class MediaDosElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];
        double soma = 0;

        // Lê os elementos do vetor e soma ao mesmo tempo
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        // Calcula a média
        double media = soma / tamanho;

        System.out.println("A média dos elementos do vetor é: " + media);

        scanner.close();
    }
}

