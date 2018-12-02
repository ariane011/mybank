package br.com.mybank;

public class Cliente {
	private String nome;
	private String cpf;
	
	//Criar o medoto que cadastrar um clientes 
	
	//Reescrevendo 
	@Override
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf;
	}

	public void cadastraCliente(String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
		
	}
 }
	

