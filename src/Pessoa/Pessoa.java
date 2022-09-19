package Pessoa;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Pessoa opessoa) {
		return (this.idade - opessoa.getIdade());
	}


}
