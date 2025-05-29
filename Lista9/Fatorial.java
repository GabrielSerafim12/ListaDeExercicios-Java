package Exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de número negativo.");
        } else {
            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}

