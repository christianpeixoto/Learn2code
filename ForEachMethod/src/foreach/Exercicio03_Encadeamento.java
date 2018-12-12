package foreach;

import java.util.Arrays;
import java.util.List;

public class Exercicio03_Encadeamento {

	private static List<Pessoa> criar(){
		return Arrays.asList(
				new Pessoa("Ana", Arrays.asList(new Pessoa("Carlos"), new Pessoa("Bruna"))),
				new Pessoa("Roberto", Arrays.asList(new Pessoa("Rodrigo"), new Pessoa("Carolina"), new Pessoa("Felipe"))),
				new Pessoa("Julia"),
				new Pessoa("Dario", Arrays.asList(new Pessoa("Cassia"), new Pessoa("Eduarda")))
				);
	}
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = criar();
		
		pessoas.forEach(pessoa -> pessoa
									.getFilhos()
									.forEach(filho -> System.out.println(filho.getNome() + 
									    										" é filho de " + 
									    										pessoa.getNome())));

		
	}
}
