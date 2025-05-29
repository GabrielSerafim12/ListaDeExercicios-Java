package Exercicios;

public class SomaDe1a100 {

    public static void main(String[] args) {
        int soma = 0;

        // Laço para somar os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            soma += i; // Adiciona o valor de i à soma
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

