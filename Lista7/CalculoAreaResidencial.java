package Exercicios;

import java.util.Scanner;

public class CalculoAreaResidencial {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variável para acumular a área total
        double areaTotal = 0;
        
        // Loop para calcular a área dos cômodos até o usuário desejar parar
        while (true) {
            // Solicitando o nome, largura e comprimento do cômodo
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();
            
            System.out.print("Digite a largura do " + nomeComodo + " (em metros): ");
            double largura = scanner.nextDouble();
            
            System.out.print("Digite o comprimento do " + nomeComodo + " (em metros): ");
            double comprimento = scanner.nextDouble();
            
            // Calculando a área do cômodo
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;  // Acumulando a área total
            
            // Exibindo a área do cômodo
            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " m²");
            
            // Limpar o buffer do scanner
            scanner.nextLine(); // Para consumir a linha em branco

            // Perguntando se o usuário deseja continuar
            System.out.print("Deseja continuar calculando outro cômodo? (SIM/NAO): ");
            String resposta = scanner.nextLine().toUpperCase();
            
            // Se a resposta for "NAO", o programa encerra o loop
            if (resposta.equals("NAO")) {
                break;
            }
        }
        
        // Exibindo o total acumulado da área
        System.out.println("A área total acumulada da residência é: " + areaTotal + " m²");
        
        // Fechando o scanner
        scanner.close();
    }
}

