package Exercicios;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int quantidade = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
