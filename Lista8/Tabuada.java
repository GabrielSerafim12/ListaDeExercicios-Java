package Exercicio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        
        // Variável para o contador da tabuada (inicia em 1)
        int i = 1;
        
        // Laço while para exibir a tabuada de 1 a 10
        while (i <= 10) {
            int resultado = numero * i;  // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado);  // Exibe o resultado
            i++;  // Incrementa o contador
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

