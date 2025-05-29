package Exercicios;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicializa a variável fatorial
        long fatorial = 1;

        // Calcula o fatorial utilizando um laço for
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica o valor de i ao fatorial
        }

        // Exibe o resultado do fatorial
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // Fecha o scanner
        scanner.close();
    }
}

