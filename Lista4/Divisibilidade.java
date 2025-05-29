package Lista4;

import java.util.Scanner;

public class Divisibilidade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O numero e divisivel por 3 e 5.");
		} else {
			System.out.println("O número não e divisivel por 3 e 5.");
		}
		sc.close();

	}

}
