package Exercicios;

import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando as variáveis para armazenar os valores
        int maior = Integer.MIN_VALUE;  // Valor inicial mínimo possível para comparações
        int menor = Integer.MAX_VALUE;  // Valor inicial máximo possível para comparações
        
        while (true) {
            // Solicitando ao usuário que insira um número
            System.out.print("Digite um valor positivo inteiro (ou um valor negativo para terminar): ");
            int valor = scanner.nextInt();
            
            // Verificando se o valor inserido é negativo, e caso seja, finaliza o loop
            if (valor < 0) {
                break;
            }
            
            // Atualizando o maior valor, se o valor atual for maior
            if (valor > maior) {
                maior = valor;
            }
            
            // Atualizando o menor valor, se o valor atual for menor
            if (valor < menor) {
                menor = valor;
            }
        }
        
        // Exibindo os resultados, apenas se pelo menos um valor positivo foi inserido
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("O maior valor informado foi: " + maior);
            System.out.println("O menor valor informado foi: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

