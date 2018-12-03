package br.com.mybank.tests;

import br.com.mybank.Funcionario;
import br.com.mybank.Gerente;

public class TestaGerente {
    
    
   public static void main(String[] args) {
	 Gerente g = new Gerente();
	 Funcionario f = new Funcionario();
	 
	 f.cadastraFuncionario("ARIANE", 001, 15000);
	 
	 g.depositarSalario(1000);
     System.out.println("Seu saldo é: " + g.consultaSalario(0001));

  }  
	
}
