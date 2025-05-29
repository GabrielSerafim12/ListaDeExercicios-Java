package Lista4;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dias tem esse ano: ");
		int dias = sc.nextInt();
		
		if (dias <=365) {
			System.out.println("Ano normal");
		}else {
			System.out.println("Ano Bissexto");
		}
		sc.close();
		
	}

}
