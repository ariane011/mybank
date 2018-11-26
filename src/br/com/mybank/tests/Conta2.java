package br.com.mybank.tests;

import br.com.mybank.Conta;

public class Conta2 {

	private double saldo;
	public int idConta;
	public double valor;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void Saca(double valor) {
		this.saldo -= valor;
	}
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void transfere(Conta origin, Conta destiny, double valor) {
		origin.saca(valor);
		destiny.deposita(valor);
		System.out.println("Saque de A" + origin.saca(valor) +  "Para tranferir para b, o valor de:" + destiny.deposita(valor));
		
	}
	
}
