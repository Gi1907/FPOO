package Concessionaria;

public class Veiculos {
	
	//ATRIBUTOS
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	
	public Veiculos(String placa, String modelo, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	//GETTER E SETTERS

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//MÉTODOS
	
		public void acelerar () {
			System.out.println("acelerando");
		}
		public void frear () {
			System.out.println("freando");
		}
		public void virar () {
			System.out.println("virando");
		}
		public void ligar () {
			System.out.println("ligando");
		}
	
}
