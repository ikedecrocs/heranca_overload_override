package geral;

public class Funcionario extends Pessoa{
	private double salarioBase;
	private double salarioFinal;
	
	public void inserirDadosFuncionario(){
		System.out.println("Dados do funcion�rio inseridos");
	}
	
	public void apresentarFuncionario() {
		System.out.println("Sal�rio base: "+salarioBase);
		System.out.println("Sal�rio final: "+salarioFinal);
	}
}
