package somaDoisNumeros;

import java.util.Scanner;

public class ConversaoDeTemperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		
		double celcius = sc.nextDouble();
		
		double fahrenheit = (celcius * 9/5) + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		
		sc.close();
	}
}
