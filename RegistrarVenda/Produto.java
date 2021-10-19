package registrandoVendas;

public class Produto {
	private int codigo;
	private String descricao;
	private Float valorVenda;
	private Float valorCusto;
	private boolean isPromocao;
	
	public Produto(int codigo, String descricao, Float valorVenda, Float valorCusto, boolean isPromocao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.isPromocao = isPromocao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Float getValorCusto() {
		return valorCusto;
	}
	public void setValorCusto(Float valorCusto) {
		this.valorCusto = valorCusto;
	}
	public boolean isPromocao() {
		return isPromocao;
	}
	public void setPromocao(boolean isPromocao) {
		this.isPromocao = isPromocao;
	}
	
	
}
