package lambda;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio03_MethodReference {

	private static List<Pessoa> cria(){
		return Arrays.asList(
				new Pessoa("Cecília", "Meirelles", LocalDate.of(1901, Month.NOVEMBER, 7)),
				new Pessoa("Fernando", "Pessoa", LocalDate.of(1888, Month.JUNE, 13)),
				new Pessoa("Raquel", "de Queiroz", LocalDate.of(1902, Month.OCTOBER, 31)),
				new Pessoa("Carlos", "Drummond", LocalDate.of(1910, Month.NOVEMBER, 17))
				);
	}
	
	public static void main(String[] args) {
		List<Pessoa> escritores = cria();

		Collections.sort(escritores, (p1, p2) -> p1.getAniversario().compareTo(p2.getAniversario()));
		
		escritores.forEach(System.out::println);
		
		Collections.shuffle(escritores);
		
		Collections.sort(escritores, Pessoa::comparePorIdade);
		
		escritores.forEach(System.out::println);
		
		
		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		Arrays.asList(stringArray).forEach(System.out::println);
	}
}
