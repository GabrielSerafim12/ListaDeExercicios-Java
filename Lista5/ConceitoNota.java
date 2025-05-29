package Exercicios;

import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida! Digite um número entre 0 e 100.");
        } else if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 80) {
            System.out.println("Conceito: B");
        } else if (nota >= 70) {
            System.out.println("Conceito: C");
        } else if (nota >= 60) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: F");
        }

        sc.close();
    }
}

