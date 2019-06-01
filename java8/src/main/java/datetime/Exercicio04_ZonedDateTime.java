package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercicio04_ZonedDateTime {
	public static void main(String[] args) {

		ZonedDateTime hoje_agora_Paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

		System.out.println(hoje_agora_Paris.toString());

		ZonedDateTime novoHojeAgoraParis = hoje_agora_Paris.plusDays(5).plusHours(5);
		
		System.out.println(novoHojeAgoraParis.toString());		
	}
}
