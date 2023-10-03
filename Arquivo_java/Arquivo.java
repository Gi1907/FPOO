package LeituraGravacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Arquivo {
	private String nomeArquivo;
	private String tipoArquivo;

	public String getNomeArquivo () {
	return nomeArquivo;
	}
	void setnomeArquivo (String nomeArquivo) {
	this.nomeArquivo = nomeArquivo;
	}
	public String getPipoArquivo () {
		return tipoArquivo;
		}
		void setTipoArquivo (String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		}
		
	public static void leitor(String path) throws IOException {
	BufferedReader buffRead = new BufferedReader (new FileReader (path));
	String linha = "";
	while (true) {
		if (linha != null) {
			System.out.println(linha);
		}
		else
			break;
		linha = buffRead.readLine();
	}
	buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter (new FileWriter(path));
		String linha2 = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha2 = in.nextLine();
		buffWrite.append(linha2 + "\n");
		buffWrite.close();
		}	
	}