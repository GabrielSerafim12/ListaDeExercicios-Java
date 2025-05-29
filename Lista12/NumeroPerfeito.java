package Exercicios;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;

        // Somar todos os divisores próprios do número
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número
        if (soma == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }
}

