package br.com.mybank;

public class Conta {

	private int idConta;
    private double saldo;

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
  		return "Conta: " + idConta + " Saldo: " + saldo;
  	}
	public void cadastraConta(int idConta, double saldo) {
		setIdConta(idConta);
		setSaldo(saldo);
	}

	public void consulta(int idConta, double saldo) {
		getIdConta();
		getSaldo();
	}
}
