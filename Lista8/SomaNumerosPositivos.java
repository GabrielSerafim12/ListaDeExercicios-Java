package Exercicio;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variável para armazenar a soma
        int soma = 0;
        
        // Laço para continuar pedindo números enquanto o usuário não digitar um número negativo
        while (true) {
            // Solicitando ao usuário que insira um número
            System.out.print("Digite um número positivo (ou um número negativo para parar): ");
            int numero = scanner.nextInt();
            
            // Se o número for negativo, o programa vai parar
            if (numero < 0) {
                break;
            }
            
            // Adiciona o número à soma
            soma += numero;
        }
        
        // Exibindo o total somado
        System.out.println("A soma total dos números positivos é: " + soma);
        
        // Fechando o scanner
        scanner.close();
    }
}

