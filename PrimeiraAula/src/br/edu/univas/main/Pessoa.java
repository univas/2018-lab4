package br.edu.univas.main;

public class Pessoa {
	
	public static String faculdade;
	private String nome;
	private String telefone;

	@Override
	public String toString() {
		String result = "PESSOA::::"
			+ "\nNome = " + this.nome
			+ "\nTelefone = " + this.telefone;
		return result;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
