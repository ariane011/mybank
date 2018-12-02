package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;
import br.com.mybank.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		
		 // cadastra cliente
	     cliente.cadastraCliente("Ariane", "00000000191");
	     //System.out.println(cliente);
		
	     // Cadastra conta do cliente chamando o objeto cliente
		conta.cadastraConta(0001, cliente);
		System.out.println(conta);
		
		// Deposita na conta
		conta.deposita(100);
		// Deposita na conta
		
		// Realiza consulta na conta
        conta.consulta(0001);
        System.out.println("Saldo: " + conta.consulta(0001));

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
