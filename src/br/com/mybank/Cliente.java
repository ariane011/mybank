package br.com.mybank;

public class Cliente {
	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cPF) {
		cpf = cPF;
	}
	
	//Criar o medoto que cadastrar um clientes 
	
	//Reescrevendo 
	@Override
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf;
	}

	public void cadastraCliente(String nome, String cPF ) {
	  setNome(nome);
	  setCPF(cPF);
		
	}
 }
	

