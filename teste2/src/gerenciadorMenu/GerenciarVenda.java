package gerenciadorMenu;

import java.util.ArrayList;
import java.util.Scanner;

import model.Venda;



public class GerenciarVenda{
	
	private ArrayList<Venda> vendas;
	private Scanner scan;
	
	public GerenciarVenda() {
		vendas = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void exibirMenu() {
			
			boolean voltar = false;
			while (!voltar) {
				System.out.println("1 - Cadastrar Venda");
				System.out.println("2 - Excluir Venda");
				
				System.out.println("3 - Voltar");
				int opcao = scan.nextInt();
				
				switch (opcao) {
					
				case 1:
					cadastrarVenda();
					break;
					
				case 2:
					excluirVenda();
					break;
					
				case 3:
					voltar = true;
					break;
				
				}
			}
		}
	
	public void cadastrarVenda() {
			
			System.out.println("Descrição do veículo: ");
			String descricao = scan.nextLine();
			
			System.out.println("Informe a placa do veículo: ");
			String placa = scan.nextLine();
			
			System.out.println("Informe o ID do vendedor: ");
			int idVendedor = scan.nextInt();
			
			System.out.println("Informe o ID do cliente: ");
			int idCliente = scan.nextInt(); 
			
			Venda venda = new Venda();
			vendas.add(venda); 
			 
		
		System.out.println("Venda cadastrada com sucesso!");
		System.out.println("O ID da venda é "  + venda.getId());
	}
	
	private Venda buscarVenda(int id){
		for(Venda venda : vendas) {
			if(venda.getId() == id) {
				return venda;
			}
		}
		return null;
		
	}
	
	private void excluirVenda() {
		System.out.println("Excluir cliente");
		System.out.println("Digite o ID do cliente que deseja excluir: ");
		int id = scan.nextInt();
		
		
		Venda vendaEncontrada = buscarVenda(id);
		if(vendaEncontrada != null) {
			vendas.remove(vendaEncontrada);
			System.out.println("venda excluída com sucesso!");
		} else {
			System.out.println("venda" + id + "não encontrado.");
		}
	}
	
}
