package ListaDeExercicios;

import java.util.Scanner;

public class mediaNumeros {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números deseja inserir: ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
		}
			
			double media = soma / n;
			
			System.out.printf("A média dos %d números é: %.2f%n", n, media);
			
		sc.close();
	}
}