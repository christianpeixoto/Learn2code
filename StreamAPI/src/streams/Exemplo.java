package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Dada a lista,  dobre os números pares e totalize
		
		System.out.println(
				lista
					.stream()
					.filter(n -> n % 2 == 0)
					.mapToInt(n -> n * 2)
					.sum());
		
		//Dada a lista,  dobre apenas os 2 primeiros números ímpares e totalize
		
		System.out.println(
				lista
					.stream()
					.filter(n -> n % 2 != 0)
					.mapToInt(n -> n * 2)
					.limit(2)
					.sum());
		
		//Dada a lista,  retorne apenas números pares maiores que 5
		
		System.out.println(
				lista
					.stream()
					.filter(n -> n % 2 == 0)
					.filter(n -> n.compareTo(5) > 0)
					.collect(Collectors.toList()));
	}
}
