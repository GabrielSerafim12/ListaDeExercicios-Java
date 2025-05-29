package Exercicios;

import java.util.Scanner;

public class ClassificarTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os comprimentos dos lados devem ser positivos.");
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os comprimentos fornecidos não formam um triângulo válido.");
        }

        scanner.close();
    }
}

