package extra1;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private Cliente cliente; 

    //Construtor
    public ContaCorrente(int numero){ 
        this.numero = numero;
        this.saldo = 0;
        
    }
    
    public int getNumero() {
    	return this.numero;
    }
    

    public double getSaldo() {
		return saldo;
	}

	//Associa Cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public double verificaSaldo(){
    	//Assert
        assert this.saldo > 0: "Erro: Saldo negativo";
        return this.saldo;
    }
    

	public void depositaValor(double deposito){
        this.saldo += deposito;
        verificaSaldo();
     }

   

    public void retiraValor(double saque){
    	this.saldo -= saque;
        verificaSaldo();
    }

    public void imprimeConta(){
        String dadosConta = "";
        dadosConta += "Numero Conta: " + this.numero + "\n";
        dadosConta += "Cliente: "      + this.cliente.getNome() + "\n";
        dadosConta += "Saldo: R$"      + this.verificaSaldo() + "\n";
        System.out.println(dadosConta+"\n");
    }

}