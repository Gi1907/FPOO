package Endereco;
public class ObjetoEndereco {
public static void main(String args) {
		
		//Criando ojetos da classe Tema passando argumentos
	ClasseEndereco objeto1 = new ClasseEndereco (1, "Rua dos Brilhantes", 81, "Centro", "Centro", "Diadema", "18220", "SP");
		
		//Chamando o método get() para apresnetar os objetos
		System.out.println(objeto1.getId());
		System.out.println(objeto1.getLogradouro());
		System.out.println(objeto1.getNumero());
		System.out.println(objeto1.getComplemento());
		System.out.println(objeto1.getBairro());
		System.out.println(objeto1.getCidade());
		System.out.println(objeto1.getCep());
		System.out.println(objeto1.getUf());
		
	}
}
