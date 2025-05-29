package Exercicios;

import java.util.Scanner;

public class SomatorioEMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double somatorio = 0;
        int quantidade = 10;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            somatorio += valor;  
        }

        double media = somatorio / quantidade;

        System.out.println("Somatório dos valores: " + somatorio);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}

