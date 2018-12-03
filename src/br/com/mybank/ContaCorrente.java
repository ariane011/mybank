package br.com.mybank;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class ContaCorrente extends Conta{
    Conta conta = new Conta();
    
    @Override // Reescrevendo o metodo cliente
    public double saca(double valor) {
    if (conta.saca(valor) > 0){
    	System.out.println("Saque realizado com sucesso!");
    	return this.saldo -= (valor + 0.02);
    }
    else 
    	System.out.println("Saldo insuficiente!");
    return 0;
    			
  }
    
}
