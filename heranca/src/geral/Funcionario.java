package geral;

public class Funcionario extends Pessoa{
	private double salarioBase;
	private double salarioFinal;
	
	public void inserirDadosFuncionario(){
		System.out.println("Dados do funcionário inseridos");
	}
	
	public void apresentarFuncionario() {
		System.out.println("Salário base: "+salarioBase);
		System.out.println("Salário final: "+salarioFinal);
	}
}
