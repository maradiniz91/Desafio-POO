package Veiculo;

import javax.print.DocFlavor.STRING;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private Float km;
	private Boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;
	
	public String abastecer (int valor) {
		if((litrosCombustivel += valor)< 60) {
						return this.modelo + "---> Veiculo abastecido em :" + this.litrosCombustivel + "Litros";
		}
		if(litrosCombustivel >= 60) {
			
			return this.modelo + "---> Nao e possivel abastecer pois o tanque esta cheio" ; 
		}
		return "";
		
	}
	
	public String frear (int valor) {
		
		if (!this.isLigado) {
			return this.modelo + "---> Atencao: O veiculo esta desligado";
		}
		if (this.velocidade == 0) {
			return this.modelo + "---> Atencao: O veiculo Ja está Parado";
		}
		if ((this.velocidade - valor) < 0){
			this.velocidade = 0;
			return this.modelo = "---> Freou: O veiculo esta parado";
		}
		this.velocidade -= valor;
		return this.modelo + "---> Freou!!  Velocidade Atual:" + this.velocidade + "km/h";
		
	}
	
	
	public String acelerar(int valor) {
		
		if (this.isLigado) {
			this.velocidade += valor;
			return this.modelo + "---> ACELEROU!!! VELOCIDADE atual: " +this.velocidade + "Km/h.";
		}
		return this.modelo + "---> ATENCAO!!! Nao e possivel Acelerar com o Motor desligado. ";
	}
	
	public String pintar() {
		return cor = "Azul";
	}
	
	public String ligar() {
		
		if (isLigado == true) {
			return this.modelo +"-->  Veiculo ja se encontra Ligado";
		}else {
			return this.modelo +"-->  Veiculo Ligado";
		}
	}
	
	public String desligado() {
				
		if (isLigado == false) {
			return this.modelo +"-->  Veiculo ja se encontra Desligado";
		}else {
			return this.modelo +"-->  Veiculo Desligado";
		}
	}
 
	
	
	public Veiculo() {
		super();
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Float km, Boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Float getKm() {
		return km;
	}

	public void setKm(float i) {
		this.km = i;
	}

	public Boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	

}
