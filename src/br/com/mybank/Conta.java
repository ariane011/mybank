package br.com.mybank;

public class Conta {

	protected int idConta;
    protected double saldo;
    
    Cliente cliente = new Cliente();

	
	public double deposita(double valor) {
		return this.saldo += valor;
	}
	
	public double saca (double valor) {
		return this.saldo -= valor;
	}
	
    public void tranfere(Conta origin, Conta destiny, double valor) {
    	origin.saca(valor);
    	destiny.deposita(valor);
    }
    
    @Override
    public String toString() {
    	return  "Cliente - " + cliente + " , " + "Conta: " + idConta;
    }
    
	public void cadastraConta(int idConta, Cliente cliente) {
		this.cliente = cliente;
		this.idConta = idConta;
		
	}
    public double consulta(int idConta) {
		this.idConta = idConta;
		return this.saldo = saldo;
	}
}
