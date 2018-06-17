package geral;

public class Pessoa {
	private int codigo;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String telefone;
	private String celular;
	
	public void mostrarTelefones() {
		System.out.println(telefone);
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setUF(String uf) {
		this.uf = uf;
	}
	
	public String getUF() {
		return uf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setCelular(String celular) {
		this.celular=celular;
	}
	
	public String getCelular() {
		return celular;
	}
}
