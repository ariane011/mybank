package br.com.mybank;

public class Funcionario {
    protected String nome;
    protected int idFuncionario;
    protected double salario;
    
    public void cadastraFuncionario(String nome, int idFuncionario, double salario) {
    	this.nome = nome;
    	this.idFuncionario = idFuncionario;
    	this.salario = salario;
    }
    
    public double depositarSalario (double valor) {
    	return this.salario += valor;
    }
    
}
