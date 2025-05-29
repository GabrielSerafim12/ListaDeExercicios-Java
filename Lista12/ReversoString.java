package Exercicios;

import java.util.Scanner;

public class ReversoString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        System.out.print("A string em ordem reversa é: ");
        for (int i = str.length() - 1; i >= 0; i--) {
           
            System.out.print(str.charAt(i));
        }

        scanner.close();
    }
}
