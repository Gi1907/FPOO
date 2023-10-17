package Shopping;

public class Produto {
	public long id;
	public String nome;
	public double preco;

	//Construtor
	public Produto (long id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;



	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
