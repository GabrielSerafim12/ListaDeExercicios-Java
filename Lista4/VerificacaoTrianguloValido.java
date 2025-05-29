package Lista4;

import java.util.Scanner;

public class VerificacaoTrianguloValido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do Triângulo: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Digite o segundo lado do Triângulo: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro lado do Triângulo: ");
		double lado3 = sc.nextDouble();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
			
			System.out.println("Esses lados formam um triangulo valido");
		} else {
			System.out.println("Esses lados não formam um triangulo válido");
		}
		sc.close();

	}

}
