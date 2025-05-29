package Lista3;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >=18) {
			System.out.println("Voçê pode dirigir");
		}else {
			System.out.println("Voçê não pode dirigir");
		}
		sc.close();

	}

}
