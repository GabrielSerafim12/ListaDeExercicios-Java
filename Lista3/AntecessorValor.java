package Lista3;

import java.util.Scanner;

public class AntecessorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int numero = sc.nextInt();
		
		int antecessor = numero - 1;
		
		
		System.out.println("O antecessor de " + numero + " é " + antecessor);
		
		sc.close();
		
		
		
	}
}
