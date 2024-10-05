package gerenciadorMenu;

import java.util.ArrayList;
import java.util.Scanner;

import model.Loja;



public class GerenciarLoja {
	
	private ArrayList<Loja> lojas;
	private Scanner scan;
	
	public GerenciarLoja() {
		lojas = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void exibirMenu() {
			
			boolean voltar = false;
			while (!voltar) {
				System.out.println("1 - Cadastrar loja");
				System.out.println("2 - Excluir loja");
				System.out.println("3 - Alterar dados da loja");
				System.out.println("4 - Voltar");
				int opcao = scan.nextInt();
				
				switch (opcao) {
					
				case 1:
					cadastrarLoja();
					break;
					
				case 2:
					excluirLoja();
					break;
				
				case 3:
					alterarLoja();
					break;
					
				case 4:
					voltar = true;
					break;
				
				}
			}
		}
	
	private void cadastrarLoja() {
		System.out.println("Informe o nome da loja: ");
		String nomeLoja = scan.nextLine();
		
		if (scan.hasNextLine()) {
	        scan.nextLine();
	    }
		
		System.out.println("Informe o endereço da loja: ");
		String enderecoLoja = scan.nextLine();
		
		System.out.println("Informe o telefone da loja: ");
		String telefoneLoja = scan.nextLine();
		
		Loja loja = new Loja(nomeLoja, enderecoLoja, telefoneLoja);
		lojas.add(loja);
		System.out.println("loja " + loja.getNomeLoja() +  " cadastrada com sucesso!");
		
	}
	
	
	
	private void excluirLoja() {
		System.out.println("Excluir loja");
		System.out.println("Digite o nome que deseja excluir: ");
		String nomeLoja = scan.nextLine();
		
		if (scan.hasNextLine()) {
	        scan.nextLine();
	    }
		
		Loja lojaEncontrada = buscarLoja(nomeLoja);
		if(lojaEncontrada != null) {
			lojas.remove(lojaEncontrada);
			System.out.println("loja excluída com sucesso!");
		} else {
			System.out.println("Loja" + nomeLoja + "não encontrada.");
		}
	}
	
	private void alterarLoja() {
		System.out.println("Alterar loja");
		System.out.println("Digite o nome da loja que deseja alterar: ");
		String nomeLoja = scan.nextLine();
		
		Loja lojaEncontrada = buscarLoja(nomeLoja);
		if(lojaEncontrada != null) {
			
			System.out.println("informe o novo nome: ");
			lojaEncontrada.setNomeLoja(scan.nextLine());
			
			System.out.println("informe o novo endereço: ");
			lojaEncontrada.setEnderecoLoja(scan.nextLine());
			
			System.out.println("informe o novo telefone: ");
			lojaEncontrada.setTelefoneLoja(scan.nextLine());
			
		}
		
	}
	
	private Loja buscarLoja(String nomeLoja){
		for(Loja loja : lojas) {
			if(loja.getNomeLoja().equals(nomeLoja)) {
				return loja;
			}
		}
		return null;
		
	}
	
    public void listarLojas() {
    	for (Loja loja : lojas) {
            System.out.println(loja);
    	
    }
            
           
        
    }
	
	
	
}
