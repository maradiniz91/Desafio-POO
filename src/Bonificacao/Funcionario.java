package Bonificacao;

public class Funcionario {
	
	public String nome;
	public int idade;
	public double salario;
	
	
	public Funcionario() {
		super();
	}
	
	
	public Funcionario(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double bonificacao() {
		
		return this.salario;		
	}
	
	
}
