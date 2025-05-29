package Lista4;

import java.util.Scanner;

public class SinalDeNumero {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero >15) {
			System.out.println("Número positivo");
		} else if (numero <15) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Zero");
		}
		sc.close();

	}

}
