package Exercicios;

import java.util.Scanner;

public class PotenciaSemExponenciacao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (B): ");
        int base = scanner.nextInt();
        
        System.out.print("Digite o expoente (E): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}
