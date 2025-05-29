package ListaDeExercicios;
import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do Triângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura do Triângulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("Digite o primeiro lado do Triângulo: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Digite o segundo lado do Triângulo: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro lado do Triângulo: ");
		double lado3 = sc.nextDouble();
		
		double perimetro = lado1 + lado2 + lado3;
		
		System.out.printf("Área do triãngulo: %.2f%n", area);
		System.out.printf("Perimetro do triãngulo: %.2f%n", perimetro);
		
		sc.close();
		
	}

}
