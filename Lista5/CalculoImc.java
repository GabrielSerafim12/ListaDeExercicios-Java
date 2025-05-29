package Exercicios;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();
  
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        sc.close();
    }
}
