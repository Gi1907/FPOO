package Func;


public class Principal {

	public static void main(String[] args) {

		//Criando um Funcionario
		Funcionario funcionario = new Funcionario("Marcelo", "123456", 3000, "15 991302928", "Rua dos Brilhantes, Diadema SP", "19/07/2006");
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Telefone" + funcionario.getTelefone());
		System.out.println("Endereço:" + funcionario.getEndereco());
		System.out.println("DataNascimento: " + funcionario.getDataNascimento());

		//Criando um Administrador
		Administrador administrador = new Administrador ("Marcia", "123456", 3000, "15 991302928", "Rua dos Brilhantes, Diadema SP", "19/07/2006", 123456);
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matricula: " + administrador.getMatricula());
		System.out.println("Salario: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereço: " + administrador.getEndereco());
		System.out.println("DataNascimento: " + administrador.getDataNascimento());
		System.out.println("Cra: " + administrador.getCra());


		//Criando um Engenheiro
		Engenheiro engenheiro = new Engenheiro ("Renan", "123456", 3000, "15 991302928", "Rua dos Brilhantes, Diadema SP", "19/07/2006", 54321);
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: " + engenheiro.getMatricula());
		System.out.println("Salario: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereço: " + engenheiro.getEndereco());
		System.out.println("DataNascimento: " + engenheiro.getDataNascimento());
		System.out.println("Cra: " + engenheiro.getNumCrea());

		//Criando um Engenheiro
		Medico medico = new Medico ("Giovana", "123456", 3000, "15 991302928", "Rua dos Brilhantes, Diadema SP", "19/07/2006", 190706);
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matricula: " + medico.getMatricula());
		System.out.println("Salario: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("DataNascimento: " + medico.getDataNascimento());
		System.out.println("Cra: " + medico.getCrm());
	}

}
