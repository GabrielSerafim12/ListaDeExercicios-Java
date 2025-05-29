package Exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Laço para imprimir a tabuada de 1 a 10
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            // Imprime o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o scanner
        scanner.close();
    }
}

