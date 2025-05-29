package Exercicios;

import java.util.Scanner;

public class DivisivelPor3e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e por 5.");
        } else {
            System.out.println("O número NÃO é divisível por 3 e por 5 ao mesmo tempo.");
        }

        sc.close();
    }
}
