package gerenciadorMenu;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;



public class GerenciarCliente{
	
	private ArrayList<Cliente> clientes;
	private Scanner scan;
	
	public GerenciarCliente() {
		clientes = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void exibirMenu() {
			
			boolean voltar = false;
			while (!voltar) {
				System.out.println("1 - Cadastrar cliente");
				System.out.println("2 - Excluir cliente");
				System.out.println("3 - Alterar dados do cliente");
				System.out.println("4 - Voltar");
				int opcao = scan.nextInt();
				
				switch (opcao) {
					
				case 1:
					cadastrarCliente();
					break;
					
				case 2:
					excluirCliente();
					break;
				
				case 3:
					alterarCliente();
					break;
					
				case 4:
					voltar = true;
					break;
				
				}
			}
		}
	
	public void cadastrarCliente() {
		System.out.println("Informe o nome do cliente: ");
		String nome = scan.nextLine();
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		System.out.println("Informe o endereço do cliente: ");
		String CPF = scan.nextLine();
		
		System.out.println("Informe o telefone do cliente: ");
		String telefone = scan.nextLine(); 
		
		Cliente cliente = new Cliente(nome, CPF, telefone);
		clientes.add(cliente); 
		
		System.out.println("Cliente cadastrado com sucesso!");
		System.out.println("Seu ID é "  + cliente.getId());
	}
	
	private Cliente buscarCliente(int id){
		for(Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
		
	}
	
	
	public Cliente buscarCpf(String CPF){
		for(Cliente cliente : clientes) {
			if(cliente.getCPF() == CPF) {
				System.out.println(cliente.getCPF());
			}
		}
		return null;
		
	}

	private void excluirCliente() {
		System.out.println("Excluir cliente");
		System.out.println("Digite o ID do cliente que deseja excluir: ");
		int id = scan.nextInt();
		
		
		Cliente clienteEncontrado = buscarCliente(id);
		if(clienteEncontrado != null) {
			clientes.remove(clienteEncontrado);
			System.out.println("cliente excluído com sucesso!");
		} else {
			System.out.println("Cliente" + id + "não encontrado.");
		}
	}
	
	private void alterarCliente() {
		System.out.println("Alterar vendedor");
		System.out.println("Digite o ID do vendedor que deseja alterar: ");
		int id = scan.nextInt();
		
		Cliente clienteEncontrado = buscarCliente(id);
		if(clienteEncontrado != null) {
			
			System.out.println("informe o novo nome: ");
			clienteEncontrado.setNome(scan.nextLine());
			
			 if (scan.hasNextLine()) {
			        scan.nextLine();
			    }
			
			System.out.println("informe o novo endereço: ");
			clienteEncontrado.setCPF(scan.nextLine());
			
			System.out.println("informe o novo telefone: ");
			clienteEncontrado.setTelefone(scan.nextLine());
			
		}
		
	}
}