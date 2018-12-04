package br.com.mybank;

public class Funcionario {
	
	protected int idFuncionario;
	protected String nome;
	protected double salario;
	
	
	public void cadastraFuncionario(String nome, int idFuncionario, double salario) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Matricula: " + this.idFuncionario + " - Salario: " + this.salario;
	}	

}
