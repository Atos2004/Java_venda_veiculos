package gerenciadorMenu;

import java.util.ArrayList;
import java.util.Scanner;

import model.Vendedor;



public class GerenciarVendedor{
	
	private ArrayList<Vendedor> vendedores;
	private Scanner scan;
	
	public GerenciarVendedor() {
		vendedores = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void exibirMenu() {
			
			boolean voltar = false;
			while (!voltar) {
				System.out.println("1 - Cadastrar vendedor");
				System.out.println("2 - Excluir vendedor");
				System.out.println("3 - Alterar dados da vendedor");
				System.out.println("4 - Voltar");
				int opcao = scan.nextInt();
				
				switch (opcao) {
					
				case 1:
					cadastrarVendedor();
					break;
					
				case 2:
					excluirVendedor();
					break;
				
				case 3:
					alterarVendedor();
					break;
					
				case 4:
					voltar = true;
					break;
				
				}
			}
		}
	
	private void cadastrarVendedor() {
		System.out.println("Informe o nome da vendedor: ");
		String nome = scan.nextLine();
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		System.out.println("Informe o endereço da vendedor: ");
		String CPF = scan.nextLine();
		
		System.out.println("Informe o telefone da vendedor: ");
		String telefone = scan.nextLine(); 
		
		Vendedor vendedor = new Vendedor(nome, CPF, telefone);
		vendedores.add(vendedor); 
		
		System.out.println("Vendedor cadastrado com sucesso!");
		System.out.println("Seu ID é "  + vendedor.getId());
	}
	
	public Vendedor buscarVendedor(int id){
		for(Vendedor vendedor : vendedores) {
			if(vendedor.getId() == id) {
				return vendedor;
			}
		}
		return null;
		
	}
	
	public Vendedor buscarVendedorNome(String nome){
		for(Vendedor vendedor : vendedores) {
			if(vendedor.getNome() == nome) {
				System.out.println(vendedor.getNome());
			}
		}
		return null;
		
	}
	
	private void excluirVendedor() {
		System.out.println("Excluir vendedor");
		System.out.println("Digite o ID do vendedor que deseja excluir: ");
		int id = scan.nextInt();
		
		
		Vendedor vendedorEncontrado = buscarVendedor(id);
		if(vendedorEncontrado != null) {
			vendedores.remove(vendedorEncontrado);
			System.out.println("Vendedor excluído com sucesso!");
		} else {
			System.out.println("Vendedor" + id + "não encontrado.");
		}
	}
	
	private void alterarVendedor() {
		System.out.println("Alterar vendedor");
		System.out.println("Digite o ID do vendedor que deseja alterar: ");
		int id = scan.nextInt();
		
		Vendedor vendedorEncontrado = buscarVendedor(id);
		if(vendedorEncontrado != null) {
			
			System.out.println("informe o novo nome: ");
			vendedorEncontrado.setNome(scan.nextLine());
			
			 if (scan.hasNextLine()) {
			        scan.nextLine();
			    }
			
			System.out.println("informe o novo endereço: ");
			vendedorEncontrado.setCPF(scan.nextLine());
			
			System.out.println("informe o novo telefone: ");
			vendedorEncontrado.setTelefone(scan.nextLine());
			
		}
		
	}
}
