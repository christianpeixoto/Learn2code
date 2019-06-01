package streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Stream <String> lines= Files.lines(Paths.get("src/streams/teste.txt"), Charset.defaultCharset());
		
		System.out.println(lines.count());
		
	}
}
