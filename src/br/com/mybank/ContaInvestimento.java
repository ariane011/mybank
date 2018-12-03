package br.com.mybank;

public class ContaInvestimento extends Conta {
	Conta conta = new Conta();
	
	@Override
	public double deposita (double valor) {
		return this.saldo += (valor + 0.015);	
	}
}
