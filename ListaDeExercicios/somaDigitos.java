package ListaDeExercicios;

import java.util.Scanner;

public class somaDigitos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		int soma = 0;
		
		int numeroAbsoluto = Math.abs(numero);
		
		while (numeroAbsoluto > 0) {
			soma += numeroAbsoluto % 10;
			numeroAbsoluto /= 10;
		}
		
		System.out.println("A soma dos digitos é: " + soma);
		
		sc.close();
	}

}
