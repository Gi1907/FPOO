package Shopping;
public class Principal {

	public static void main(String[] args) {
		
		//Criando um Produto
			Produto produto = new Produto(1, "Sorvete", 20);
				System.out.println("Produto: ");
				System.out.println("Sorvete: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());

				//Criando um Sorvete
				Sorvete sorvete = new Sorvete (1, "Pistache", 20, 1);
				System.out.println("Sorvete: ");
				System.out.println("Sorvete: " + sorvete.getNome());
				System.out.println("Preço: " + sorvete.getPreco());
				System.out.println("Temperatura Adequda: " + sorvete.getTempAdequada());
			
				//Criando uma Pessoa Juridica
				Camisa camisa = new Camisa (1, "Tommy", 150, "rosa", "algodão", "M");
				System.out.println("Camisa: ");
				System.out.println("Camisa: " + camisa.getNome());
				System.out.println("Preço: " + camisa.getPreco());
				System.out.println("Temperatura Adequda: " + camisa.getCor());
				System.out.println("Temperatura Adequda: " + camisa.getTecido());
				System.out.println("Temperatura Adequda: " + camisa.getTamanho());
			}
}