package extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	private String nome;
	private ArrayList<Cliente> clientes;

	// Construtor
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<Cliente>(); // Lista de clientes
	}

	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public static void menuPrincipal() {
		System.out.println("Menu de Opções :");
		System.out.println("1 : Cadastrar Cliente");
		System.out.println("2 : Consultar Cliente");
		System.out.println("3 : Listar Clientes");
		System.out.println("4 : Sacar");
		System.out.println("5 : Depositar");
		System.out.println("6 : Sair");
	}

	
	
	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Lucas Pego");
		Scanner leitor = new Scanner(System.in);
		int opcao = 5;

		while (true) {
			menuPrincipal();
			opcao = Integer.parseInt(leitor.nextLine());

			switch (opcao) {
			case 1: {
				String nome;
				int numeroConta;
				System.out.println("Informe o nome ");
				nome = leitor.nextLine();
				System.out.println("Informe o número da conta");
				
				boolean existeConta = false;
				numeroConta = Integer.parseInt(leitor.nextLine());
				for (Cliente clienteBusca : banco.clientes) {
					if (clienteBusca.getConta().getNumero() == numeroConta) {
						existeConta = true;
						break;
					}
				}
				if (existeConta) {
					System.out.println("Conta já existente!");
					
				} else {
					Cliente cliente = new Cliente(nome, numeroConta);
					banco.addCliente(cliente);
				}
				break;
			}
			case 2: {
				System.out.println("Informe a conta corrente");
				int conta = Integer.parseInt(leitor.nextLine());
				Cliente clienteAchado = null;
				for (Cliente clienteBusca : banco.clientes) {
					if (clienteBusca.getConta().getNumero() == conta) {
						clienteAchado = clienteBusca;
						break;
					}
				}
				if (clienteAchado != null) {
					clienteAchado.getConta().imprimeConta();
				} else {
					System.out.println();
				}

				break;

			}
			case 3: {
				System.out.println("Lista Clientes");
				for (Cliente clienteBusca : banco.clientes) {
					System.out.println(
							"Cliente: " + clienteBusca.getNome() + "\nNumero: " + clienteBusca.getConta().getNumero());
				}
			break;
			}
			case 4: {
				System.out.println("Informe a conta Corrente");
                int conta = Integer.parseInt(leitor.nextLine());
                Cliente clienteAchado = null;

                for(Cliente clienteBusca : banco.clientes){

                    if(clienteBusca.getConta().getNumero() == conta){
                        clienteAchado = clienteBusca;
                        clienteAchado.operaSaque();
                        break;
                    }
                }

                if(clienteAchado!=null){
                    clienteAchado.getConta().imprimeConta();
                }else{
                    System.out.println("Conta Corrente não encontrada para " + conta);
                }
			}
			break;
			case 5: {
				System.out.println("Informe a conta Corrente");
		        int conta = Integer.parseInt(leitor.nextLine());
		        Cliente clienteAchado = null;

		        for(Cliente clienteBusca : banco.clientes){

		            if(clienteBusca.getConta().getNumero() == conta){
		                clienteAchado = clienteBusca;
		                clienteAchado.operaDeposito();
		                break;
		            }
		        }

		        if(clienteAchado!=null){
		            clienteAchado.getConta().imprimeConta();
		        }else{
		            System.out.println("Conta Corrente não encontrada para " + conta);
		        }
			}
			break;
			case 6: {
				System.out.println("Programa Encerrado");
				System.exit(0);
			}
			default: {
				System.out.println("Opção não existe");
			}
			}
		}
	}

}