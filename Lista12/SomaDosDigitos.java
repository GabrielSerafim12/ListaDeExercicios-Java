package Exercicios;

import java.util.Scanner;

public class SomaDosDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int numeroAbsoluto = Math.abs(numero); // Garante que funcione também para números negativos

        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;
            soma += digito;
            numeroAbsoluto /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);

        scanner.close();
    }
}
