package somaDoisNumeros;

import java.util.Scanner;

public class ClasseMedia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		
		int numero2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero");
		
		int numero3 = sc.nextInt();
		
		double media = (numero1 + numero2 + numero3) / 3.0;
		
		System.out.println("A media dos numeros é: " + media);
		
		sc.close();
	}

}
