package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoverElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.print("Quantos elementos o vetor terá? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        // Lê os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Lê o elemento a ser removido
        System.out.print("Digite o elemento que deseja remover: ");
        int elementoRemover = scanner.nextInt();

        // Usa ArrayList para armazenar os elementos que permanecerão
        ArrayList<Integer> novoVetor = new ArrayList<>();

        for (int num : vetor) {
            if (num != elementoRemover) {
                novoVetor.add(num);
            }
        }

        // Exibe o vetor atualizado
        System.out.print("Vetor após a remoção: ");
        for (int num : novoVetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

