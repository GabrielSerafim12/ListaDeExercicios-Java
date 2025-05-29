package ListaDeExercicios;

import java.util.Scanner;

public class ConversaoMoeda {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais R$: ");
		double reais = Double.parseDouble(sc.next().replace(",", "."));
		
		System.out.println("Digite a taxa em Dólar (USD): ");
		double taxaDolar = Double.parseDouble(sc.next().replace(",", "."));
		
		System.out.println("Digite a taxa em Euro (EUR): ");
		double taxaEuro = Double.parseDouble(sc.next().replace(",", "."));
		
		System.out.println("Digite a taxa em Libra (GBP): ");
		double taxaLibra = Double.parseDouble(sc.next().replace(",", "."));
		
		double valorEmDolar = reais / taxaDolar;
		double valorEmEuro = reais / taxaEuro;
		double valorEmLibra = reais / taxaLibra;
		
		System.out.printf("%nConversão de Moedas %n");
		System.out.printf("R$ %.2f equivale a: %n", reais);
		System.out.printf("- US$ %.2f (Dolar) %n", valorEmDolar);
		System.out.printf("- € %.2f (Euro) %n",valorEmEuro);
		System.out.printf("- £ %.2f (Libra) %n", valorEmLibra);
		
		sc.close();
	}

}
