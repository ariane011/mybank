package br.com.mybank;

public class Conta {

    private double saldo;
    public double valor;
    public int idConta;
    
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca (double valor) {
		this.saldo -= valor;
	}
	
    public void tranfere(Conta origin, Conta destiny, double valor) {
    	
    	origin.saca(valor);
    	destiny.deposita(valor);
    }
    
}
