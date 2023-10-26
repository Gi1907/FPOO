package Zoologico;

public abstract class Animal {

	//ATRIBUTOS
	private String nome;
	private String sexo;
	private String raca;
	
	
	//ATRIBUTOS
	public Animal (String nome, String sexo, String raca ) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
		
	}
	//GETTER E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	//MÉTODOS
	
	public void dormir () {
		System.out.println("Dormindo");
	}
	public void caminhar () {
		System.out.println("Caminhando");
	}
	public void correr () {
		System.out.println("Correndo");
	}
	public void emitirSom () {
		System.out.println("Emitindo som");
	}
}
