package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.ContaInvestimento;

public class TestaContaInvestimento {
    
	public static void main(String[] args) {
	
	Cliente cliente = new Cliente(); // instancia objeto cliente
    ContaInvestimento ci = new ContaInvestimento(); // instancia objeto ci

    // cadastra cliente
     cliente.cadastraCliente("Ariane", "00000000191");
     System.out.println("Cliente - " + cliente);

	// Deposita na conta e realiza consulta chamando o objeto CC
	ci.deposita(100);
	System.out.println("Deposito realizado com sucesso! Seu saldo �: " + ci.consulta(0001));
	
	}
}
