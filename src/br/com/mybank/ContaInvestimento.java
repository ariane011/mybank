package br.com.mybank;

public class ContaInvestimento extends Conta {
	Conta conta = new Conta();
	ContaCorrente cc = new ContaCorrente();
	
	@Override
	public double deposita (double valor) {
		if (cc.deposita(valor) > 0){
	    }
		return this.saldo += (valor + 0.015);	
	}
}
