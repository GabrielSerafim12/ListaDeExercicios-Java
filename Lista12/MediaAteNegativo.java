package Exercicios;

import java.util.Scanner;

public class MediaAteNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

            soma += numero;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Média aritmética: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}

