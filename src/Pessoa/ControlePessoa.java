package Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ControlePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Joao", 15);
		Pessoa pessoa2 = new Pessoa("Leandro", 21);
		Pessoa pessoa3 = new Pessoa("Paulo", 17);
		Pessoa pessoa4 = new Pessoa("Jessica", 18);
		
		List<Pessoa> listaPessoa = new ArrayList<>();
		
		listaPessoa.add(pessoa);
		listaPessoa.add(pessoa2);
		listaPessoa.add(pessoa3);
		listaPessoa.add(pessoa4);
		
		// EXERCICIO 4 
		
		System.out.println("\n---Mais Velho---\n");
		Pessoa pessoaMaisvelha = Collections.max(listaPessoa);
		System.out.println(pessoaMaisvelha.getNome());
		
		// EXERCICIO 5
		System.out.println("\n---Lista---\n");
		
			
		for(int i = 0; i <listaPessoa.size(); i++) {			
		System.out.println(listaPessoa.get(i).getNome() + "  -  " + listaPessoa.get(i).getIdade());
		}
		
		System.out.println("\n---Excluido da Lista pessoas com idade inferior a 18 anos---\n");
		listaPessoa.remove(pessoa);
		listaPessoa.remove(pessoa3);
			
		for(int i = 0; i <listaPessoa.size(); i++) {			
		System.out.println(listaPessoa.get(i).getNome() + "  -  " + listaPessoa.get(i).getIdade());
		}
		
		// EXERCICIO 6
		for(int i = 0; i <listaPessoa.size(); i++) {
		
		System.out.println("\n---Verificar se Jessica existe na Lista---\n");
		if(listaPessoa.contains(pessoa4)) {
			System.out.println("Jessica esta na Lista");
			System.out.println(listaPessoa.get(i).getIdade());
			
		}else {
			System.out.println("Jessica não está na Lista");
		}
		
		}
		
		
	}

}
