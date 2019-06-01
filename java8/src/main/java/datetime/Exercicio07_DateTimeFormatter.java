package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio07_DateTimeFormatter {
	public static void main(String[] args) {

		LocalDateTime hoje_agora = LocalDateTime.now();

		System.out.println(hoje_agora.toString());
		System.out.println(hoje_agora.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(hoje_agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	}
}
