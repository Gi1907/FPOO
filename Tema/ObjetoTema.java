package Tema;

public class ObjetoTema {

public static void main(String args) {
		
		//Criando ojetos da classe Tema passando argumentos
	ClasseTema tema1 = new ClasseTema (1, "Giovana", 5000.0, "Azul");
		
		//Chamando o método get() para apresnetar os objetos
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
	}
}