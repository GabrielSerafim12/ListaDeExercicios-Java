package Exercicio;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para acumular a soma das notas e contar a quantidade de notas válidas
        double soma = 0;
        int contador = 0;
        
        // Laço para solicitar as notas até que o usuário digite um número inválido
        while (true) {
            // Solicitando ao usuário que insira uma nota
            System.out.print("Digite uma nota de 0 a 10 (nota inválida para sair): ");
            double nota = scanner.nextDouble();
            
            // Verificando se a nota é válida (entre 0 e 10)
            if (nota < 0 || nota > 10) {
                break;  // Se a nota for inválida, sai do laço
            }
            
            // Acumulando a soma das notas e contando a quantidade de notas válidas
            soma += nota;
            contador++;
        }
        
        // Verificando se o usuário inseriu pelo menos uma nota válida
        if (contador > 0) {
            // Calculando e exibindo a média
            double media = soma / contador;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
