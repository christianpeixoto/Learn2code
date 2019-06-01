package datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercicio02_LocalTime {
	public static void main(String[] args) {

		LocalTime agora = LocalTime.now();

		System.out.println(agora.toString());

		if (agora.isSupported(ChronoUnit.DAYS))
			System.out.println("Guarda data");
		else
			System.out.println("Não guarda data");
		
		LocalTime novoAgora = agora.plusHours(5);
		
		System.out.println(novoAgora.toString());		
	}
}
