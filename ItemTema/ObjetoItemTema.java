package ItemTema;
public class ObjetoItemTema {
public static void main(String args) {
		
		//Criando ojetos da classe Tema passando argumentos
	ClasseItemTema itemTema1 = new ClasseItemTema (1, "Giovana", "Azul");
		
		//Chamando o método get() para apresnetar os objetos
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
	}
}
