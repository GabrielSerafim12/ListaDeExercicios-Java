package Exercicio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que digite um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        // Inicializando a variável fatorial com o valor 1
        int fatorial = 1;
        
        // Verificando se o número é maior ou igual a 0, pois o fatorial de números negativos não existe
        if (numero < 0) {
            System.out.println("Fatorial de números negativos não existe.");
        } else {
            // Usando um laço enquanto para calcular o fatorial
            int contador = numero;
            while (contador > 1) {
                fatorial *= contador;  // Multiplica o fatorial pelo valor do contador
                contador--;  // Decrementa o contador
            }
            // O fatorial é o produto dos números de 1 até o número inserido
            System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

