package br.com.mybank.tests;

import br.com.mybank.Cliente;

public class ClienteTeste {
   public static void main(String args[]) 
   {
	   Cliente c = new Cliente();
	   
	   c.setNome("Ariane");
	   c.setCPF("12345678910");
	   
	   System.out.println(c.getCPF());
	   System.out.println(c.getNome());
   }
   
}
