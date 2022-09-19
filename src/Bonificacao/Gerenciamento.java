package Bonificacao;

public class Gerenciamento {

	public static void main(String[] args) {
				
		
		Gerente gerente = new Gerente();
		gerente.setNome("Rodrido do Santos");
		gerente.setIdade(42);
		gerente.setSalario(12000.00);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setNome("Samuel Diniz Dias");
		supervisor.setIdade(23);
		supervisor.setSalario(7000.00);
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Ana Paula Menezes");
		vendedor.setIdade(32);
		vendedor.setSalario(2500.00);
		
		System.out.println("----------------Gerente---------------- ");
		Double bonificacaoG = gerente.bonificacao();
		System.out.println("Nome: ");
		System.out.println(gerente.getNome());
		System.out.println("Idade : ");
		System.out.println(gerente.getIdade());
		System.out.println("Salario : ");
		System.out.println(gerente.getSalario());
		System.out.println("Bonificacao: : ");
		System.out.println(bonificacaoG);
		System.out.println("---------------------------------------\n ");
		
		System.out.println("----------------Supervisor-------------- ");
		Double bonificacaoS = supervisor.bonificacao();
		System.out.println("Nome: ");
		System.out.println(supervisor.getNome());
		System.out.println("Idade : ");
		System.out.println(supervisor.getIdade());
		System.out.println("Salario : ");
		System.out.println(supervisor.getSalario());
		System.out.println("Bonificacao: : ");
		System.out.println(bonificacaoS);
		System.out.println("---------------------------------------\n ");
		
		System.out.println("----------------Vendedor-------------- ");
		Double bonificacaoV = vendedor.bonificacao();
		System.out.println("Nome: ");
		System.out.println(vendedor.getNome());
		System.out.println("Idade : ");
		System.out.println(vendedor.getIdade());
		System.out.println("Salario : ");
		System.out.println(vendedor.getSalario());
		System.out.println("Bonificacao: : ");
		System.out.println(bonificacaoV);
		System.out.println("---------------------------------------\n ");
		
		
		
		
		

	}

}
