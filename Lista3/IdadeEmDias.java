package Lista3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedindo a data de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        System.out.print("Digite o mês de nascimento (1 a 12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();

        // Data de nascimento e data atual
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        // Calculando a diferença entre as datas
        Period periodo = Period.between(dataNascimento, dataAtual);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Convertendo tudo para dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Exibindo o resultado
        System.out.println("Sua idade exata é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        System.out.println("Sua idade em dias é aproximadamente: " + totalDias + " dias.");

        sc.close();
    }
}
