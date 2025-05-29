package Exercicios;

import java.util.Scanner;

public class SomaDigitosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();

        int somaTotal = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) { // Verifica se é par
                somaTotal += somaDosDigitos(i);
            }
        }

        System.out.println("Soma dos dígitos de todos os números pares no intervalo: " + somaTotal);

        scanner.close();
    }

    // Função que calcula a soma dos dígitos de um número
    public static int somaDosDigitos(int numero) {
        int soma = 0;
        int numeroAbsoluto = Math.abs(numero); // Para evitar problemas com números negativos

        while (numeroAbsoluto > 0) {
            soma += numeroAbsoluto % 10;
            numeroAbsoluto /= 10;
        }

        return soma;
    }
}

