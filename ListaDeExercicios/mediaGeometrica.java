package ListaDeExercicios;

import java.util.Scanner;

public class mediaGeometrica {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Digite a quantidade de numeros: ");
		int numero1 = sc.nextInt();
		
		
		double somaProduto = 1.0;
		
		double[] numeros = new double[numero1];
		
		
		for (int i = 0; i <numero1; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = sc.nextDouble();
			somaProduto *= numeros[i];
			
		}
		
		double somaGeometrica = Math.pow(somaProduto, 1.0 / numero1);
		
		
		System.out.printf("A media Geometrica dos números fornecidos é: %.2f%n", somaGeometrica);
		
		
		sc.close();
	}

}
