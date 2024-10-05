package gerenciadorMenu;

import java.util.ArrayList;
import java.util.Scanner;

import model.Veiculo;

public class GerenciarVeiculo  {
	
	private ArrayList<Veiculo> veiculos;
	private Scanner scan;
	
	public GerenciarVeiculo() {
		veiculos = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public void exibirMenu() {
		
		boolean voltar = false;
		while (!voltar) {
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Excluir veículo");
			System.out.println("3 - Alterar dados do veículo");
			System.out.println("4 - Voltar");
			int opcao = scan.nextInt();
			
			switch (opcao) {
				
			case 1:
				cadastrarVeiculo();
				break;
				
			case 2:
				excluirVeiculo();
				break;
			
			case 3:
				alterarVeiculo();
				break;
				
			case 4:
				voltar = true;
				break;
			
			}
		}
	}
	
	public Veiculo buscarPlaca(String placa){
		for(Veiculo veiculo : veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				System.out.println(veiculo.getPlaca());
				
			}
		}
		return null;
		
	}
	
	private void cadastrarVeiculo() {
		System.out.println("Informe a categoria do veículo: ");
		String categoria = scan.nextLine();
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		System.out.println("Informe a descrição do veículo: ");
		String descricao = scan.nextLine();
		
		System.out.println("Informe a marca do veículo: ");
		String marca = scan.nextLine();
		
		System.out.println("Informe o modelo do veículo: ");
		String modelo = scan.nextLine();
		
		System.out.println("Informe o ano do veículo: ");
		int ano = scan.nextInt();
		
		System.out.println("Informe a placa do veículo: ");
		String placa = scan.nextLine();
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		System.out.println("Informe o preço do veículo: ");
		double preco = scan.nextDouble();
		
		Veiculo veiculo = new Veiculo(categoria, descricao, marca, modelo, ano, placa, preco);
		veiculos.add(veiculo);
	}
	
	
	private void excluirVeiculo() {
		System.out.println("Excluir veículo");
		System.out.println("Digite a placa do veículo que deseja excluir: ");
		String placa = scan.nextLine();
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		Veiculo veiculoEncontrado = buscarPlaca(placa);
		if(veiculoEncontrado != null) {
			veiculos.remove(veiculoEncontrado);
			System.out.println("veículo excluído com sucesso!");
		} else {
			System.out.println("Placa" + placa + "não encontrada.");
		}
	}
	
	private void alterarVeiculo() {
		System.out.println("Alterar veículo");
		System.out.println("Digite a placa do veículo que deseja alterar: ");
		String placa = scan.nextLine(); 
		
		 if (scan.hasNextLine()) {
		        scan.nextLine();
		    }
		
		Veiculo veiculoEncontrado = buscarPlaca(placa);
		if(veiculoEncontrado != null) {
			
			System.out.println("informe a nova marca: ");
			veiculoEncontrado.setMarca(scan.nextLine());
			
			System.out.println("informe o novo modelo: ");
			veiculoEncontrado.setModelo(scan.nextLine());
			
			System.out.println("informe o novo ano: ");
			veiculoEncontrado.setAno(scan.nextInt());
			
			System.out.println("informe a nova placa: ");
			veiculoEncontrado.setPlaca(scan.nextLine());
			
			System.out.println("informe o novo preço: ");
			veiculoEncontrado.setPreco(scan.nextDouble());
			
		}
		
		
		
	}

}
