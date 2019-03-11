package br.com.mybank;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	
	
	//Criar o medoto que cadastrar um clientes 
	
	//Reescrevendo 
	@Override
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf;
	}


	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

 }
	

