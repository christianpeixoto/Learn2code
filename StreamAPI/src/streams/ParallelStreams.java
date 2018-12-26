package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Integer> myList = IntStream.rangeClosed(1,100)
										.boxed()
										.collect(Collectors.toList());
		
		Stream<Integer> sequentialStream = myList
											.stream()
											.filter(p -> p > 90);

		sequentialStream.forEach(p -> System.out.println("High Nums sequential="+p));		
		
		Stream<Integer> highNums = myList
									.parallelStream()
									.filter(p -> p > 90);
		
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
	}
}
