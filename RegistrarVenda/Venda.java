package RegistrarVenda;

public class Venda {
	private float desconto; // desconto//
	private int qtdItens; // quantidade de itens//
	private float valor = 0.0f; // valor//
	Produto produto;
	Vendedor vendedor;

	public float calcularValor(Produto produto, Vendedor vendedor) {
		float calculando = ((produto.getValorVenda() * this.qtdItens) - this.desconto);
		return calculando;
	}

	public boolean efetuarDesconto(float pDesconto, Produto produto, Vendedor vendedor) {
		this.desconto = (produto.getValorVenda() * (pDesconto/100));
		float calcDesconto = (produto.getValorVenda() - this.desconto);
		if (calcDesconto <= produto.getValorCusto()) {
			System.out.println("Desconto ultrapassa valor de custo, compra inválida!");
			return false;
		} else {
			return true;
		}

	}

	public float calcularComissao(Produto produto, Vendedor vendedor) {
		float calcular;
		if (produto.isPromocao() == true) {
			calcular = ((vendedor.getComissao() / 100) / 2) * produto.getValorVenda();
			return calcular;
		} else {
			calcular = (vendedor.getComissao() / 100) * produto.getValorVenda();
			return calcular;
			
		}
		
	}

	public void imprimir(Vendedor vendedor, Produto produto) {
		System.out.println("Vendedor " + "\nCódigo: " + vendedor.getCodigo() + "\nNome: " + vendedor.getNome()
				+ "\nComissão: %" + vendedor.getComissao());
		System.out.println("Quantidade de itens vendidos: " + this.qtdItens);
		System.out.println("Código e descrição do produto " + "\nCódigo: " + produto.getCodigo() + "\nDescrição: "
				+ produto.getDescricao());
		if (this.desconto >= 0  && this.efetuarDesconto(desconto, produto, vendedor)) {
			System.out.println("Valor do desconto do produto: " + this.desconto);
		} else {
			System.out.println("Produto não tem desconto ou desconto ultrapassa valor de custo!.");
		}
		if (produto.isPromocao() == true) {
			System.out.println("Produto está em promoção!");
			System.out.println("Valor de venda do produto: R$" + ((this.calcularValor(produto, vendedor)-this.desconto)-((vendedor.getComissao() / 100) / 2) * produto.getValorVenda()));
		} else {
			System.out.println("Produto não está em promoção!");
			System.out.println("Valor de venda do produto: R$" + ((this.calcularValor(produto, vendedor)-this.desconto)-(vendedor.getComissao() / 100) * produto.getValorVenda()));
		}
		return;
	}

	public int getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}
