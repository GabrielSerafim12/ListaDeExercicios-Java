package Exercicios;

import java.util.Scanner;

public class PrimosNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

