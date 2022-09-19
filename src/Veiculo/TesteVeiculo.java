package Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo c1 = new Veiculo();
		c1.setMarca("Chevrolet");
		c1.setModelo("Onix");
		c1.setPlaca("PLL6F50");
		c1.setCor("Preto");
		c1.setKm(100);
		c1.setIsLigado(true);		
		c1.setLitrosCombustivel(30);
		c1.setVelocidade(100);
		c1.setPreco(65.000);
		
		Veiculo c2 = new Veiculo();
		c2.setMarca("Volkswagen");
		c2.setModelo("Fusca");
		c2.setPlaca("DFRF50");
		c2.setCor("Amarelo");
		c2.setKm(100);
		c2.setIsLigado(false);		
		c2.setLitrosCombustivel(10);
		c2.setVelocidade(90);
		c2.setPreco(15.000);
		
		// Testando método Ligar veiculo 
		
		System.out.println("------------Ligar Veiculo------------ \n");
		String resposta = c1.ligar();
		String resposta2 = c2.ligar();
		System.out.println(resposta);
		System.out.println(resposta2);
		System.out.println("----------------------------------------\n");
		
		// Testando método Desligar veiculo 
		System.out.println("------------Desligar Veiculo------------\n");
		String resposta3 = c1.desligado();
		System.out.println(resposta3);
		System.out.println("\n");
		System.out.println("----------------------------------------\n");
		
		// Testando método Pintar veiculo
		System.out.println("------------Pintar Veiculo------------\n");
		String resposta4 = c1.pintar();
		System.out.println(resposta4);
		String resposta5 = c2.pintar();
		System.out.println(resposta5);
		System.out.println("\n");
		System.out.println("----------------------------------------\n");
		
		// Testando método  Acelerar veiculo
				System.out.println("------------Acelerar Veiculo------------\n");
				System.out.println(c2.acelerar(20));
				System.out.println(c1.acelerar(20));
				System.out.println("\n");
				System.out.println("----------------------------------------\n");
				
		// Testando método Frear veiculo
				System.out.println("------------Frear Veiculo------------\n");
				System.out.println(c2.frear(20));
				System.out.println(c1.frear(20));
				System.out.println("\n");
				System.out.println("----------------------------------------\n");
				
				
				// Testando método Abastecer veiculo
				System.out.println("------------Abastecer Abastecer------------\n");
				System.out.println(c2.abastecer(20));
				System.out.println(c1.abastecer(20));
				System.out.println("\n");
				System.out.println("----------------------------------------\n");
		
	}

}
