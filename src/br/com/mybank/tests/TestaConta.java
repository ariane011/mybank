package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		//Criar um (VOID)metodo para cadastrar conta a conta precisa ter um Cliente, ID
		conta.cadastraConta(0001, 100);
		System.out.println(conta);
		
		//Criar um (VOID) metodo para consultar conta (ID, Saldo e titular)
		conta.consulta(0001, 100);
		System.out.println(conta);
		//Criar um (DOUBLE) metodo para depositar valores
		conta.deposita(100);
		System.out.println(conta);
		//Criar um (DOUBLE) metodo para sacar valores
		conta.saca(50);
		System.out.println(conta);
		//Criar um (DOUBLE) metodo para sacar valores
		conta.saca(250);
		System.out.println(conta);
		
	}

}
