package Exercicios;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo (negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("Soma total dos números positivos: " + soma);

        scanner.close();
    }
}

