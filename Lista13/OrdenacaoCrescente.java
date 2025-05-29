package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoCrescente {
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

        // Ordena o vetor em ordem crescente
        Arrays.sort(vetor);

        // Exibe o vetor ordenado
        System.out.print("Vetor em ordem crescente: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

