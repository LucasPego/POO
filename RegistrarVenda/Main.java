package RegistrarVenda;

//não consegui fazer a comissão funcionar

public class Main {
	public static void main(String[] args) {
		Produto luvas = new Produto(1, "Para utilizar nas mãos", 20, 5, false);
		Vendedor clovis = new Vendedor("Clóvis", "Parque Cuiabá", 1, 5);
		Venda venda1 = new Venda();

		venda1.setQtdItens(2);
		venda1.calcularValor(luvas, clovis);
		venda1.calcularComissao(luvas, clovis);
		venda1.imprimir(clovis, luvas); // comissao inclusa
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		Produto sapato = new Produto(2, "Para utilizar nos pés", 100, 80, true);
		Vendedor lorivaldo = new Vendedor("Lorivaldo", "Parque Atalaia", 2, 10);
		Venda venda2 = new Venda();

		venda2.setQtdItens(1);
		venda2.efetuarDesconto(10, sapato, lorivaldo);
		venda2.calcularValor(sapato, lorivaldo);
		venda2.calcularComissao(sapato, lorivaldo);
		venda2.imprimir(lorivaldo, sapato);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		Venda venda3 = new Venda();
		
		venda3.setQtdItens(2);
		venda3.efetuarDesconto(30, sapato, lorivaldo);
		venda3.calcularComissao(sapato, lorivaldo);
		venda3.calcularValor(sapato, lorivaldo);
		venda3.imprimir(lorivaldo, sapato);
	}

}
