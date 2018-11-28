package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		//Esse metodo já precisa estar criado
		cliente.cadastraCliente("Ariane Sousa", "12345678910");
		
		//Criar um (VOID)metodo para cadastrar conta a conta precisa ter um Cliente, ID
		conta.cadastraConta()
		//Criar um (VOID) metodo para consultar conta (ID, Saldo e titular)
		conta.consulta();
		//Criar um (DOUBLE) metodo para depositar valores
		conta.deposita(100);
		//Criar um (DOUBLE) metodo para sacar valores
		conta.saca(50);
		//Criar um (DOUBLE) metodo para sacar valores
		conta.saca(250);
		
		//Apenas para finalizar
		conta.consulta();
	}

}
