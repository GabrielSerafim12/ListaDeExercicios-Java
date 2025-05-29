package Exercicios;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma Criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um Adolescente.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é um Adulto.");
        } else if (idade >= 65) {
            System.out.println("Você é um Idoso.");
        } else {
            System.out.println("Idade inválida.");
        }

        scanner.close();
    }
}
