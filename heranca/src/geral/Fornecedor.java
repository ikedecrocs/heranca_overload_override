package geral;

public class Fornecedor extends Pessoa{
	private String cnpj;
	private String ie;
	private String contato;
	
	public void inserirDadosFornecedor() {
		System.out.println("Dados do fornecedor inseridos");
	}
	
	public void apresentarFornecedor() {
		System.out.println("CNPJ: "+cnpj);
		System.out.println("IE: "+ie);
		System.out.println("Contato: "+contato);
	}
}
