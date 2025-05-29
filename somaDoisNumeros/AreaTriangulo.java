package somaDoisNumeros;

import java.util.Scanner;


public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura do triangulo");
		
		double largura = sc.nextDouble();
		
		System.out.println("Altura do triangulo");
		
		double altura = sc.nextDouble();
		
		double area = largura * altura;
		
		System.out.println("A area do triangulo é: " + area);
		
		sc.close();
	}
}
