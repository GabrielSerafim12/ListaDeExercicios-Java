package ListaDeExercicios;

import java.util.Scanner;

public class calculoDePotencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número base: ");
		double base = sc.nextDouble();
		
		System.out.print("Digite o numero do expoente: ");
		double expoente = sc.nextDouble();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.printf("%.2f elevado a %.2f é igual a %.2f%n", base, expoente, resultado);
		
		sc.close();
	}

}
