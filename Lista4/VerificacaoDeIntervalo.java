package Lista4;

import java.util.Scanner;

public class VerificacaoDeIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		if (numero > 10 && numero <20) {
			System.out.println("O numero está dentro do intervalo de 10 a 20.");
		}else {
			System.out.println("O numero está fora do intervalo.");
		}
		sc.close();

	}

}
