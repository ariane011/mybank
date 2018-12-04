package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Conta conta = new Conta();
		Conta conta2 = new Conta();

		
		 // cadastra cliente
	     cliente.cadastraCliente("Ariane", "00000000191");
	     cliente2.cadastraCliente("Kaique de Miranda", "12345678910");
	     
	     //System.out.println(cliente);
		
	     // Cadastra conta do cliente chamando o objeto cliente
		conta.cadastraConta(0001, cliente);
		conta2.cadastraConta(0002, cliente2);
		System.out.println(conta);
		System.out.println(conta2);
		
		// Deposita na conta
		conta.deposita(100);
		conta2.deposita(50);
		// Deposita na conta
		
		// Realiza consulta na conta
        conta.consulta(0001);
        System.out.println("Saldo da conta 1: " + conta.consulta(0001));
        conta2.consulta(0002);
        System.out.println("Saldo da conta 2: " + conta2.consulta(0002));

        // Realiza saque na CONTA CORRENTE
		conta.saca(50);
		System.out.println(conta);
		
		// Realiza consulta na conta
        conta.consulta(0001);
        System.out.println("Saldo: " + conta.consulta(0001));
		
        // Realiza saque na conta
		conta.saca(250);
		System.out.println(conta);
		
		// Realiza consulta na conta
        conta.consulta(0001);
        System.out.println("Saldo: " + conta.consulta(0001));
		
	}

}
