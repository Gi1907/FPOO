package Concessionaria;

public class Onibus extends Veiculos {

	public Onibus(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
		
	}
	
	@Override
	public void acelerar() {
		System.out.println("O ônibus está acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O ônibus está freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O ônibus está virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O ônibus está ligando");
	}
	
}

