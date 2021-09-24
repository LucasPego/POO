package RegistrarVenda;

public class Vendedor {
	
	private String nome;
	private int codigo;
	private int comissao; //porcentagem
	private String endereco;
	
	public Vendedor(String nome, String endereco, int codigo, int comissao) {
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;
		this.comissao = comissao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
