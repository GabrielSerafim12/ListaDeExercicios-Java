package Exercicios;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite uma nota entre 0 e 10 (qualquer outro valor encerra): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;
            }

        } while (nota >= 0 && nota <= 10);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}

