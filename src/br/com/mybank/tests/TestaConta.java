package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;
import br.com.mybank.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		
		 // cadastra cliente
	     cliente.cadastraCliente("Ariane", "00000000191");
	     System.out.println(cliente);
		
	     // Cadastra conta do cliente chamando o objeto cliente
		conta.cadastraConta(0001, cliente);
		System.out.println(conta);
		
		cc.cadastraConta(0001, cliente);
		// Realiza saque da conta corrente
		cc.saca(300);
		System.out.println(cc);
		
		//Realiza consulta na conta
		conta.consulta(0001, 100);
		System.out.println(conta);
		
		// Deposita na conta
		conta.deposita(100);

        // Realiza saque na conta
		conta.saca(50);
		System.out.println(conta);
		
        // Realiza saque na connta
		conta.saca(250);
		System.out.println(conta);
		
	}

}
