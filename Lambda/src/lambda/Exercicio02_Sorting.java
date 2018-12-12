package lambda;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio02_Sorting {

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

		//Java 7
		Collections.sort(escritores, new Comparator<Pessoa>() {
			 @Override	
			 public int compare(Pessoa p1, Pessoa p2) {
				 return p1.getNome().compareTo(p2.getNome());
			 }
		 });
		
		escritores.forEach(System.out::println);
		
		Collections.shuffle(escritores);  //mistura a lista
		
		//Java 8
		Collections.sort(escritores, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		
		escritores.forEach(System.out::println);
	}
	
}
