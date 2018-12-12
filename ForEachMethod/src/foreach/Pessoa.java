package foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Pessoa {

	private final String nome;
	
	private final List<Pessoa> filhos;

	public Pessoa(String nome, List<Pessoa> filhos) {
		this.nome = nome;
		this.filhos = filhos;
	}

	public Pessoa(String nome) {
		this.nome = nome;
		this.filhos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Pessoa> getFilhos() {
		return Collections.unmodifiableList(filhos);
	}
	
}
