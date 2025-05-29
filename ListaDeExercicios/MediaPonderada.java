package ListaDeExercicios;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite o primeiro peso");
		
		double peso1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota");
		
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite o segundo peso");
		
		double peso2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota");
		
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite o tericeiro peso");
		
		double peso3 = sc.nextDouble();
				
		double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("Digite suas notas: " + mediaPonderada);
		
		sc.close();
	}
}
		
		