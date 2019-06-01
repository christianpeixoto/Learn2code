package funcao;

import java.util.Arrays;
import java.util.List;

public class ForEachMetodoEncadeado {
	public static void main(String[] args) {
		List<Pessoa> pessoas = criar();
		
		pessoas.forEach(pessoa -> pessoa
									.getFilhos()
									.forEach(filho -> System.out.println(filho.getNome() + 
									    										" É filho de " + 
									    										pessoa.getNome())));
	}

	private static List<Pessoa> criar(){
		return Arrays.asList(
				new Pessoa("Ana", new Pessoa("Carlos"), new Pessoa("Bruna")),
				new Pessoa("Roberto", new Pessoa("Rodrigo"), new Pessoa("Carolina"), new Pessoa("Felipe")),
				new Pessoa("Julia"),
				new Pessoa("Dario", new Pessoa("Cassia"), new Pessoa("Eduarda"))
				);
	}	
}

class Pessoa{
	
	private String nome;
	
	private List<Pessoa> filhos;
	
	public Pessoa(String nome, Pessoa... filhos) {
		this.nome = nome;
		this.filhos = Arrays.asList(filhos);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public List<Pessoa> getFilhos(){
		return this.filhos;
	}
}
