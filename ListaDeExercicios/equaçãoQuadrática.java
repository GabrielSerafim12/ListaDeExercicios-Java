package ListaDeExercicios;

import java.util.Scanner;

public class equaçãoQuadrática {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2* a);
			double x2 = (-b - Math.sqrt(delta)) / (2* a);
			System.out.printf("As raízes da equação são: x1 = %.2f e x2 %.2f%n", x1, x2);
			
		}else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.printf("A equação tem uma única raiz real: x = %.2f%n", x);
			
		}else {
			System.out.println("A equação não possui raízes reais (Delta negativo).");
		}
		sc.close();
	}
	

}
