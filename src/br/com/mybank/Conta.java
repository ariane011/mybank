package br.com.mybank;

public class Conta {

	public int idConta;
    private double saldo;
    public double valor;
    
    
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
    
  //Reescrevendo o 
  	@Override
  	public String toString() {
  		return "Nome: " + idConta + " Saldo: " + saldo;
  	}
}
