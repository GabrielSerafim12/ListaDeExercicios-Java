package Exercicios;

import java.util.Scanner;

public class MaiorEMenorValor {
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

        // Inicializa maior e menor valor
        int maior = vetor[0];
        int menor = vetor[0];

        // Percorre o vetor para encontrar o maior e o menor valor
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        scanner.close();
    }
}

