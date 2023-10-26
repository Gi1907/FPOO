package Zoologico;


public class Principal {


	public static void main (String [] args) {
		Lobo lobo = new Lobo ("Thor", "M", "Qualquer");
		lobo.emitirSom();

		Leao leao = new Leao ("Leao", "M", "Qualquer");
		leao.emitirSom();

		Tigre tigre = new Tigre ("Leao", "M", "Qualquer");
		tigre.emitirSom();

		Gato gato = new Gato ("Thor", "M", "Qualquer");
		gato.emitirSom();

		Cachorro cachorro = new Cachorro ("Leao", "M", "Qualquer");
		cachorro.emitirSom();
	}
}
