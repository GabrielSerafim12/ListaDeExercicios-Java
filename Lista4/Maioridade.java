package Lista4;

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		if (idade >=18) {
			System.out.println("Você pode dirigir");
		} else {
			System.out.println("Você não pode dirigir");
		}
		sc.close();

		
	}

}
