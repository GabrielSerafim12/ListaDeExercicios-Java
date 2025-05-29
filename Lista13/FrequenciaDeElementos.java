package Exercicios;

import java.util.HashMap;
import java.util.Scanner;

public class FrequenciaDeElementos {
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

        // Usa HashMap para contar a frequência de cada elemento
        HashMap<Integer, Integer> frequencia = new HashMap<>();

        for (int num : vetor) {
            if (frequencia.containsKey(num)) {
                frequencia.put(num, frequencia.get(num) + 1);
            } else {
                frequencia.put(num, 1);
            }
        }

        // Exibe a frequência de cada elemento
        System.out.println("\nFrequência dos elementos:");
        for (int chave : frequencia.keySet()) {
            System.out.println("Número " + chave + " aparece " + frequencia.get(chave) + " vez(es)");
        }

        scanner.close();
    }
}
