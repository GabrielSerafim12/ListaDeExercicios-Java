package Lista3;

import java.util.Scanner;

public class SucessorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int numero = sc.nextInt();
		
		int sucessor = numero + 1;
		
		
		System.out.println("O antecessor de " + numero + " é " + sucessor);
		
		sc.close();
		
		
		
	}
}
