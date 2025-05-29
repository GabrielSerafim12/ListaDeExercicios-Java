package Exercicios;

import java.util.Scanner;

public class MediaDeNumeros {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a soma dos números
        double soma = 0;

        // Laço para ler 10 números
        for (int i = 1; i <= 10; i++) {
            // Solicita ao usuário que digite um número
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();

            // Adiciona o número à soma
            soma += numero;
        }

        // Calcula a média
        double media = soma / 10;

        // Exibe a média
        System.out.println("A média dos 10 números fornecidos é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}

