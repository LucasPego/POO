package extra1;

import java.util.Scanner;

public class Cliente {
    Scanner leitor = new Scanner(System.in);//Leitor

    private String nome;
    private ContaCorrente conta; 
    
    //Construtor que associa cliente com ContaCorrente
    public Cliente(String nome, int numero){ 
        this.nome = nome;
        this.conta = new ContaCorrente(numero);
        this.conta.setCliente(this);
    }

    public String getNome() {
        return this.nome;
    }
    
    public ContaCorrente getConta() {
    	return this.conta;
    }

    public void operaDeposito (){
    	
        Scanner scan = new Scanner(System.in);
        double valor;
        System.out.print ("Digite um valor de deposito: R$");
        valor = scan.nextDouble();

        if (valor <= 0) {
            System.out.print("Digite um valor positivo maior que zero!");
        } else {
            conta.depositaValor(valor);
        }
    }

    public void operaSaque (){

        Scanner scan = new Scanner(System.in);
        double valor;
        System.out.print  ("Digite um valor de saque: R$");
        valor = scan.nextDouble();
        
        if ((valor <= 0 || (conta.getSaldo() - valor)<=0)) {
            System.out.print("Não foi possível realizar o saque!");
        } else {
            conta.retiraValor(valor);
        }
    }
}