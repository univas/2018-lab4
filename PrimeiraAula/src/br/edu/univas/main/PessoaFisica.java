package br.edu.univas.main;

public class PessoaFisica extends Pessoa {

	private String cpf;

	@Override
	public String toString() {
		String result =  super.toString()
				+ "\nCPF = " + cpf;
		return result;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
