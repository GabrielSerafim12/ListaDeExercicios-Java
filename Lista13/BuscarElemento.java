package Exercicios;

import java.util.Scanner;

public class BuscarElemento {
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

        // Solicita o elemento a ser buscado
        System.out.print("Digite o elemento que deseja buscar: ");
        int elementoBusca = scanner.nextInt();

        boolean encontrado = false;

        // Verifica se o elemento está presente no vetor
        for (int num : vetor) {
            if (num == elementoBusca) {
                encontrado = true;
                break;
            }
        }

        // Exibe o resultado
        if (encontrado) {
            System.out.println("O elemento " + elementoBusca + " está presente no vetor.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}

