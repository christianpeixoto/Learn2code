package datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Exercicio06_Duration {
	public static void main(String[] args) {
		Instant t1 = Instant.now();

		System.out.println("Digite qualquer coisa.");
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNext()) {
			Instant t2 = Instant.now();

			long ms = Duration.between(t1, t2).toMillis();

			System.out.println(t1);
			System.out.println(t2);
			System.out.println(ms);
		}
		
		scanner.close();
	}
}
