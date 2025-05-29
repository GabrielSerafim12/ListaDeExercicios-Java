package Exercicios;

import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        while (true) {
            System.out.print("Digite um valor positivo (ou um valor negativo para sair): ");
            int numero = scanner.nextInt();

            // Se o número for negativo, sai do laço
            if (numero < 0) {
                break;
            }

            // Atualiza o maior valor, se necessário
            if (numero > maior) {
                maior = numero;
            }

            // Atualiza o menor valor, se necessário
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe o maior e o menor valor
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("O maior valor informado foi: " + maior);
            System.out.println("O menor valor informado foi: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}

