package br.edu.univas.main;

import java.util.ArrayList;

public class StartApp {

	public static void main(String[] args) {
		//Pessoa.faculdade
		Pessoa pessoa = new Pessoa();
		pessoa.faculdade = "Univas";
		
		Pessoa pessoa2 = pessoa;
		pessoa2.faculdade = "Univas Virtual";
		
		System.out.println(pessoa2.faculdade);
		System.out.println(pessoa.faculdade);
		
		pessoa2 = new Pessoa();
		pessoa = pessoa2;
		
		Pessoa.faculdade = "Univas 321";
		System.out.println(pessoa2.faculdade);
		System.out.println(pessoa.faculdade);
		
		PessoaFisica pFisica = new PessoaFisica();
		pFisica.setNome("Rodrigo");
		pFisica.setTelefone("9999-9999");
		pFisica.setCpf("999.999.999-99");
		
		PessoaJuridica pJuridica = new PessoaJuridica();
		pJuridica.setNome("Univas");
		pJuridica.setTelefone("8833-8833");
		
		
		System.out.println(pFisica);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa);
		pessoas.add(pFisica);
		
		pessoa = pFisica;
		
		//essa linha abaixo não compila! Ou seja
		//não podemos colocar uma instância de uma "Pessoa"
		//dentro de uma variável do tipo "PessoaFisica"
		//pFisica = pessoa;
	}
	
}
