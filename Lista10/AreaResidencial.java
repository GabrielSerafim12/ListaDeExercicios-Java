package Exercicios;

import java.util.Scanner;

public class AreaResidencial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0; // Variável para armazenar a área total acumulada
        String continuar = "SIM"; // Variável para controlar a continuidade

        while (continuar.equalsIgnoreCase("SIM")) {
            // Solicita o nome, largura e comprimento do cômodo
            System.out.print("Digite o nome do cômodo: ");
            String comodo = scanner.nextLine();

            System.out.print("Digite a largura do " + comodo + " (em metros): ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do " + comodo + " (em metros): ");
            double comprimento = scanner.nextDouble();

            // Calcula a área do cômodo
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo; // Acumula a área total

            // Exibe a área do cômodo
            System.out.println("A área do " + comodo + " é: " + areaComodo + " metros quadrados.");

            // Solicita se o usuário deseja continuar
            scanner.nextLine(); // Limpa o buffer
            System.out.print("Deseja continuar calculando outro cômodo? (SIM/NAO): ");
            continuar = scanner.nextLine();
        }

        // Exibe a área total acumulada
        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");
        scanner.close();
    }
}

