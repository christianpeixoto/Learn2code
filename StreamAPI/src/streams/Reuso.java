package streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Reuso {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c")
			        				.filter(s -> s.startsWith("a"));

		stream.anyMatch(s -> true);    
//		stream.noneMatch(s -> true); //remover o comentário gera erro por reuso de stream
		
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
															.filter(s -> s.startsWith("a"));

		streamSupplier.get().anyMatch(s -> true);   
		streamSupplier.get().noneMatch(s -> true);  
			
	}
}
