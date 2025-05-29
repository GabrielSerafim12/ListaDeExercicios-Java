package Lista3;

import java.util.Scanner;

public class SalarioReajuste {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o percentual de reajuste (%): ");
		double reajuste = sc.nextDouble();
		
		double novoSalario = salario + (salario * reajuste / 100);

		System.out.printf("O novo salário do funcionário será: R$ %.2f%n", novoSalario);
		
		sc.close();
	}

}
