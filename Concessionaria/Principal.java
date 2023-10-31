package Concessionaria;

public class Principal {

	public static void main (String [] args) {
		Onibus onibus = new Onibus ("GIO1907", "Mercedes", "Rosa", 2007);
		onibus.acelerar();
		onibus.frear();
		onibus.virar();
		onibus.ligar();

		System.out.println("");
		
		Carro carro = new Carro ("GIO1907", "Mercedes", "Rosa", 2007);
		carro.acelerar();
		carro.frear();
		carro.virar();
		carro.ligar();



	}
}
