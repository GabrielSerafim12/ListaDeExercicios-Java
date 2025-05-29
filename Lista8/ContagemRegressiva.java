package Exercicio;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();
        
        // Laço para realizar a contagem regressiva
        while (numero >= 0) {
            System.out.println(numero);  // Exibe o número atual
            numero--;  // Decrementa o número
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

