package TDE3;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes   = new ArrayList<Cliente> ();
    }
    public void addCliente(Cliente c) {  
        clientes.add(c);
    }
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Lucas");
        
        Cliente lucas = new Cliente("Lucas",200);
        banco.addCliente (lucas);
        
        banco.addCliente  (new Cliente ("Gabriel",  201));
        banco.addCliente  (new Cliente ("Guilherme",  202));

        System.out.println("Banco " + banco.nome + " - Operações");
        for (Cliente cliente : banco.clientes) {//Iterador
            System.out.println("\nCliente " + cliente.getNome() + " - operações");
            cliente.opera();
        }

        System.out.println("\nBanco " + banco.nome + "- Clientes");
        for (Cliente cliente: banco.clientes) { //Iterador
            cliente.getConta().imprimeConta();
        }
    }
}
