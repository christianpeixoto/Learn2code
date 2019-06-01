package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio01_LocalDate {
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		System.out.println(hoje.toString());

		if (hoje.isSupported(ChronoUnit.HOURS))
			System.out.println("Guarda tempo");
		else
			System.out.println("Não guarda tempo");
		
		LocalDate novoHoje = hoje.plusDays(5);
		
		System.out.println(novoHoje.toString());		
	}
}
