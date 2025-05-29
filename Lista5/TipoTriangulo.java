package Exercicios;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A: ");
        int a = sc.nextInt();

        System.out.print("Digite o comprimento do lado B: ");
        int b = sc.nextInt();

        System.out.print("Digite o comprimento do lado C: ");
        int c = sc.nextInt();

        
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados NÃO formam um triângulo válido.");
        }

        sc.close();
    }
}

