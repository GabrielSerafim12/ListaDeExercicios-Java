package Lista3;

import java.util.Scanner;

	public class ConversorTemperatura {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Digite a temperatura em Fahrenheit: ");
	        double fahrenheit = sc.nextDouble();

	        
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        
	        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);

	        sc.close();
	    }
	}

