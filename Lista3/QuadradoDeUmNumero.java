package Lista3;

import java.util.Scanner;

public class QuadradoDeUmNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		int quadrado = numero * numero;
		
		System.out.println("O quadrado de :" + numero + " " + quadrado );
		
		sc.close();
	}
	
}

