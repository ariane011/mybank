package br.com.mybank;

public class Gerente extends Funcionario {
     
	@Override
	public double depositarSalario(double valor) {
		return this.salario += (valor + 0.125);
	}
	
	public double consultaSalario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
		return this.salario = salario;
		
	}
      
}
