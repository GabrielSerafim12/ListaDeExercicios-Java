package Exercicios;

import java.util.Scanner;

public class SomatorioFatorial {
    // Função para calcular o fatorial de um número
    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaFatorial = 0;

        // Lê 15 números e calcula o fatorial de cada um
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Calcula o fatorial do número e soma ao total
            somaFatorial += fatorial(numero);
        }

        System.out.println("O somatório dos fatoriais dos 15 números é: " + somaFatorial);
        scanner.close();
    }
}

