package Lista3;

import java.util.Scanner;

public class Rentagulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Base do Retangulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a Altura do Retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A area do Retangulo é: "+ area);
		
		sc.close();
		
	}

}
