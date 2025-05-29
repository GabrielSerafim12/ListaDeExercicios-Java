package Exercicios;

import java.util.Scanner;

public class VerificacaoNumeroPrimo {
 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();

	        boolean ehPrimo = true;

	        if (numero <= 1) {
	            ehPrimo = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(numero); i++) {
	                if (numero % i == 0) {
	                    ehPrimo = false;
	                    break;
	                }
	            }
	        }

	        if (ehPrimo) {
	            System.out.println(numero + " é um número PRIMO.");
	        } else {
	            System.out.println(numero + " NÃO é um número primo.");
	        }

	        sc.close();
	    }
	}

