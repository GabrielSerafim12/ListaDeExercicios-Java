package Exercicios;

import java.util.Scanner;

public class DivisaoInteira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();
 
        if (divisor == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return;
        }

        int quociente = 0;

      
        while (dividendo >= divisor) {
            dividendo -= divisor; 
            quociente++;           
        }

        System.out.println("O resultado da divisão inteira é: " + quociente);

        scanner.close();
    }
}

