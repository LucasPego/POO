package TDE3;

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

    public void opera(){
            Scanner scan = new Scanner(System.in);
            double valor;
            //leitura do teclado
            System.out.println("Entre um valor de deposito: R$");
            valor = scan.nextDouble();
            conta.depositaValor(valor);
            
            System.out.println("Entre um valor de saque: R$");
            valor = scan.nextDouble();
            conta.retiraValor(valor);
            valor = scan.nextDouble();
    }
}