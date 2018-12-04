package br.com.mybank.tests;

import br.com.mybank.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.cadastraFuncionario("Ariane Sousa", 001, 10000.00);
		
		System.out.println(funcionario);
	}

}
