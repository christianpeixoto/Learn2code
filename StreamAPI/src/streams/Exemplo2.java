package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exemplo2 {

	public static void main(String[] args) {
		List<String> inteiros = Arrays.asList("a1", "a2", "b1", "c2", "c3", "c1");

		inteiros
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);		
			
			
		Arrays.asList("a1", "a2", "a3")
		    .stream()
		    .findFirst()
		    .ifPresent(System.out::println);		
		
		Stream.of("a1", "a2", "a3")
	    	.findFirst()
	    	.ifPresent(System.out::println);
		
		IntStream
			.range(1, 4)
	    	.mapToObj(i -> "a" + i)
	    	.forEach(System.out::println);		
		
	}
}
