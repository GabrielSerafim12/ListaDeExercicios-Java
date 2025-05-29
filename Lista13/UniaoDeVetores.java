package Exercicios;

import java.util.Scanner;

public class UniaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho e os elementos do primeiro vetor
        System.out.print("Digite o tamanho do primeiro vetor: ");
        int tamanho1 = scanner.nextInt();
        int[] vetor1 = new int[tamanho1];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Lê o tamanho e os elementos do segundo vetor
        System.out.print("Digite o tamanho do segundo vetor: ");
        int tamanho2 = scanner.nextInt();
        int[] vetor2 = new int[tamanho2];
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Cria o vetor que armazenará a união
        int[] vetorUniao = new int[tamanho1 + tamanho2];

        // Copia os elementos do primeiro vetor
        for (int i = 0; i < tamanho1; i++) {
            vetorUniao[i] = vetor1[i];
        }

        // Copia os elementos do segundo vetor
        for (int i = 0; i < tamanho2; i++) {
            vetorUniao[tamanho1 + i] = vetor2[i];
        }

        // Exibe o vetor união
        System.out.print("Vetor união: ");
        for (int num : vetorUniao) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

