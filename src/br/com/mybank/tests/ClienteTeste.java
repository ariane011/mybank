package br.com.mybank.tests;

import br.com.mybank.Cliente;
import br.com.mybank.Conta;

public class ClienteTeste {
   public static void main(String args[]) 
   {
	   Conta a = new Conta();
	   Conta b = new Conta();
	   Cliente c = new Cliente();
	   
	   a.deposita(200);
	   a.tranfere(a, b, 50);
	   
	   
	   c.setNome("Ariane");
	   c.setCPF("12345678910");
	   
	   System.out.println(c.getCPF());
	   System.out.println(c.getNome());
   }
   
   
   
}
