package Atv2Heranca;


public class Principal {
	public static void main(String[] args) {

	//Criando uma Veículo
	Veiculo veiculo = new Veiculo("Ford", "1", 2006, "Azul");
	System.out.println("Veiculo: ");
	System.out.println("Marca: " + veiculo.getMarca());
	System.out.println("Modelo: " + veiculo.getModelo());
	System.out.println("Ano: " + veiculo.getAno());
	System.out.println("Cor: " + veiculo.getCor());


	//Criando Automóvel
	Automovel automovel = new Automovel ("Ford", "1", 2006, "Azul", 4, "v8");
	System.out.println("Veiculo: ");
	System.out.println("Marca: " + automovel.getMarca());
	System.out.println("Modelo: " + automovel.getModelo());
	System.out.println("Ano: " + automovel.getAno());
	System.out.println("Cor: " + automovel.getCor());
	System.out.println("Cor: " + automovel.getNumeroPortas());
	System.out.println("Cor: " + automovel.getMotor());


	//Criando uma Moto
	Moto moto = new Moto ("Ford", "1", 2006, "Azul", 19);
	System.out.println("Veiculo: ");
	System.out.println("Marca: " + moto.getMarca());
	System.out.println("Modelo: " + moto.getModelo());
	System.out.println("Ano: " + moto.getAno());
	System.out.println("Cor: " + moto.getCor());
	System.out.println("Cor: " + moto.getCilindrada());
}

}


