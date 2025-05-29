package Exercicios;

import java.util.Scanner;

public class LeituraValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0; // Variável para armazenar o somatório
        int totalValores = 0; // Contador de valores lidos
        double media = 0.0; // Média aritmética

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sai do laço se o número for negativo
            }

            soma += numero; // Acumula o somatório
            totalValores++; // Incrementa o contador de valores lidos
        }

        if (totalValores > 0) {
            media = (double) soma / totalValores; // Calcula a média
            System.out.println("Somatório dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
            System.out.println("Total de valores lidos: " + totalValores);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }

        scanner.close();
    }
}

