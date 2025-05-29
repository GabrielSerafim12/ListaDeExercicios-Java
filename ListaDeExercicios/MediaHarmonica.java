package ListaDeExercicios;

import java.util.Scanner;

public class MediaHarmonica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int numero = sc.nextInt();
		
		double somaInversos = 0.0;
		double[] numeros = new double[numero];
		
		for (int i = 0; i < numero; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = sc.nextDouble();
			
			somaInversos += 1.0 / numeros[i];
		}
		
		double mediaHarmonica = numero / somaInversos;
		
		System.out.printf("A media harmõnica dos números fornecidos é: %.2f%n", mediaHarmonica);
		
		sc.close();
		
	}
}
