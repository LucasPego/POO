package registrandoVendas;

public class RegistroVendaPrincipal {
	public static void main(String[] args) {
		
		Produto xbox = new Produto(1,"Xbox Series S", 2000.0f, 1500.0f, false);
		Vendedor vendedor = new Vendedor("Lucas", 1,"Mordor");
		Venda venda = new Venda();
		venda.setVendedor(vendedor);
		venda.setProduto(xbox);
		venda.setQuantidadeItens(2);
		venda.calcularValor();
		System.out.println("Comissao: " + venda.calcularComissao());
		venda.imprimir();
		
		System.out.println("--------------------------------------------");
        vendedor = new Vendedor("Fujioka", 2, "Rua Jabam");
        venda = new Venda();
		Produto ps4 = new Produto(2,"PS4", 100.0f, 80.0f, true);
		venda.setVendedor(vendedor);
		venda.setProduto(ps4);
		venda.setQuantidadeItens(3);
		venda.efetuarDesconto(10);
		venda.calcularValor();
		System.out.println("Comissao: " + venda.calcularComissao());
		venda.imprimir();
		
		System.out.println("--------------------------------------------");
        venda = new Venda();
		venda.setVendedor(vendedor);
		venda.setProduto(ps4);
		venda.setQuantidadeItens(2);
		venda.efetuarDesconto(30);
		venda.calcularValor();
		System.out.println("Comissao: " + venda.calcularComissao());
		venda.imprimir();
	}
}
