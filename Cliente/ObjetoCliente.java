package Cliente;

public class ObjetoCliente {

public static void main(String args) {
		
	//Criando ojetos da classe Tema passando argumentos
	ClasseCliente cliente1 = new ClasseCliente (1, "Giovana", "15 991302928", "53335579852", "19280");
		
		//Chamando o método get() para apresnetar os objetos
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
}
}