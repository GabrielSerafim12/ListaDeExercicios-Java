package ListaDeExercicios;

import java.util.Scanner;

public class CalculosDeJuros {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIgite o Capital inicial (R$): ");
		double capital = sc.nextDouble();
		
		System.out.print("Digite a taxa de juros anaul (%): ");
		double taxaJuros = sc.nextDouble() / 100;
		
		System.out.print("Digite o numero de anos: ");
		int anos = sc.nextInt();
		
		double montante = capital * Math.pow(1 + taxaJuros, anos);
		
		System.out.printf("O montante final após %d anos será de R$ %.2f%n", anos, montante);
		
		sc.close();
}
}
		


