package geral;

public class Cliente extends Pessoa{
	private double limiteCredito;
	private double rendaMensal;
	private String rg;
	private String cpf;
	
	public void inserirDadosCliente() {
		System.out.println("Dados do cliente inseridos");
	}
	
	public void apresentarCliente() {
		System.out.println("Limite de crédito: "+limiteCredito);
		System.out.println("Renda Mensal: "+rendaMensal);
		System.out.println("RG: "+rg);
		System.out.println("CPF"+cpf);
	}
}
