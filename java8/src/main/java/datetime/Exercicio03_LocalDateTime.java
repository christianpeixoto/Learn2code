package datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercicio03_LocalDateTime {
	public static void main(String[] args) {

		LocalDateTime hoje_agora = LocalDateTime.now();

		System.out.println(hoje_agora.toString());

		if (hoje_agora.isSupported(ChronoUnit.DAYS))
			System.out.println("Guarda data");
		else
			System.out.println("Não guarda data");
		
		if (hoje_agora.isSupported(ChronoUnit.HOURS))
			System.out.println("Guarda tempo");
		else
			System.out.println("Não guarda tempo");
		
		LocalDateTime novoHojeAgora = hoje_agora.plusDays(5).plusHours(5);
		
		System.out.println(novoHojeAgora.toString());		
	}
}
