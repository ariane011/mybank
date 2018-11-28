package br.com.mybank.tests;

import br.com.mybank.Cliente;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.cadastraCliente("Ariane Sousa", "12345678910");
		System.out.println(cliente);
	}
}
