package somaDoisNumeros;

import java.util.Scanner;

public class DivicaoNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um Segundo número");
		
		int numero2 = sc.nextInt();
		
		int resultado = numero1 / numero2;
		
		int resto = numero1 % numero2;
		
		System.out.println("A divição dos numeros é :" + resultado);
		
		System.out.println("O resto da divisão é: " + resto);
		sc.close();
	}
}
