package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercicio05_Period {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

		Period p = Period.between(birthday, today);
		long p2 = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("Você tem " + p.getYears() + " anos, " + p.getMonths() +
		                   " meses e " + p.getDays() +
		                   " dias. (total em dias: " + p2 + ")");
	}
}
