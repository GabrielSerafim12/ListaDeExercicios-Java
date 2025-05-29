package Exercicios;

import java.util.Scanner;

public class ContarZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numeroStr = scanner.nextLine(); // Lê como string para facilitar

        int contadorZeros = 0;

        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) == '0') {
                contadorZeros++;
            }
        }

        System.out.println("Quantidade de dígitos zero: " + contadorZeros);

        scanner.close();
    }
}

