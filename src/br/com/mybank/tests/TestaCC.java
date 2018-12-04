package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.ContaCorrente;

public class TestaCC{
	
	public static void main(String[] args) {
		    
		    Cliente cliente = new Cliente(); // instancia objeto cliente
		    ContaCorrente cc = new ContaCorrente(); // instancia objeto cc
		
		    // cadastra cliente
		     cliente.cadastraCliente("Ariane", "00000000191");
		     System.out.println("Cliente - " + cliente);

		    
			// Deposita na conta e realiza consulta chamando o objeto CC
			cc.deposita(100);
			System.out.println("Deposito realizado com sucesso! Seu saldo �: " + cc.consulta(0001));
			

	        // Realiza saque na CONTA CORRENTE
			cc.saca(50);
			System.out.println("Saque realizado com sucesso! Seu saldo �: " + cc.consulta(0001));
			
			
	
	}

}
