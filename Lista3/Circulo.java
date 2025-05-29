package Lista3;

import java.util.Scanner;

public class Circulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do perimetro");
		
		double raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O perimetro do circulo é: " + perimetro);
		
		sc.close();
	}

}
