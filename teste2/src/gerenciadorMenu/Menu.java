package gerenciadorMenu;

import java.util.Scanner;

public class Menu {
	static String menu = "----Menu----";
	GerenciarVeiculo gv = new GerenciarVeiculo();
	GerenciarLoja glj = new GerenciarLoja();
	GerenciarVendedor gvdor = new GerenciarVendedor();
	GerenciarCliente gcli = new GerenciarCliente();
	GerenciarVenda gvda = new GerenciarVenda();
	
	
	
	Scanner scan = new Scanner(System.in);
	public void exibirMenu() {
		int op;
		int op1;
		int op2;
		int escolha;
		do {
			System.out.println(menu);
			System.out.println("- Opção 1: Frente de Loja.\r\n"
					+ "- Opção 2: Manutenção no Cadastro.\r\n"
					+ "- Opção 3: Sair.");
			op = scan.nextInt();
			if (op==1) {
				do {
					System.out.println("Frente de Loja!");
					System.out.println("Opção 1: Gerenciar Veículo"); 
					System.out.println("Opção 2: Gerenciar Loja");
					System.out.println("Opção 3: Gerenciar Vendedor");
					System.out.println("Opção 4: Gerenciar Cliente"); 
					System.out.println("Opção 5: Gerenciar Venda ");
					System.out.println("Opção 6: Voltar para o menu superior.");
					op1 = scan.nextInt();
					switch(op1) {
						case 1:
							System.out.println("1 - consultar placa ");
							System.out.println("2 - voltar menu ");
							escolha = scan.nextInt();
							if (escolha ==1) {
									System.out.println("digite a palca a ser buscada: ");
									String placa = scan.nextLine();
									gv.buscarPlaca(placa);
									
									
							} else if (escolha ==2) {
								break;
							}
							
							
							
							
						case 2:
							System.out.println("1 - Listar todas as Lojas ");
							System.out.println("2 - voltar menu ");
							escolha = scan.nextInt();
							if (escolha ==1) {
								glj.listarLojas();
									
							} else if (escolha ==2) {
								break;
							}
							
	
						case 3:
							
							System.out.println("1 - Consultar vendedor por nome: ");
							System.out.println("2 - voltar menu ");
							escolha = scan.nextInt();
							if (escolha ==1) {
								System.out.println("nome do vendedor: ");
								String nome = scan.nextLine();
								gvdor.buscarVendedorNome(nome);
									
							} else if (escolha ==2) {
								break;
							}
							
						case 4:
							
						
						System.out.println("1 -  Cadastrar Cliente");
						System.out.println("2 -  Consultar Cliente por CPF ");
						System.out.println("3 - Voltar para o menu superior.");
						escolha = scan.nextInt();
						
						if (escolha == 1) {
							gcli.cadastrarCliente();
						} else if (escolha == 2) {
							System.out.println("qual cpf: ");
							String CPF = scan.nextLine();
							gcli.buscarCpf(CPF);
						} else break;
							

							
							
						
						case 5:
							
							System.out.println("1 - Cadastrar Venda.");
							System.out.println("2 - voltar");
							escolha = scan.nextInt();
							
							if (escolha == 1) {
								gvda.cadastrarVenda();
							} else break;
							
							
							
							break;
						case 6:
							break;
						default: System.out.println("Valor Invalido!");
							break;
						}
				
					} while (op1!=6);
				
			}
			else if (op==2) {
				do {
					System.out.println("Manutenção no Cadastro!");
					System.out.println("Opção 1: Gerenciar Veículo"); 
					System.out.println(" Opção 2: Gerenciar Loja");
					System.out.println(" Opção 3: Gerenciar Vendedor");
					System.out.println("Opção 4: Gerenciar Cliente");
					System.out.println("Opção 5: Gerenciar Venda"); 
					System.out.println("Opção 6: Voltar para o menu superior");
					
					
					op2 = scan.nextInt();
					switch(op2) {
						case 1: gv.exibirMenu();
							break;
						case 2: glj.exibirMenu();
							break;
						case 3: gvdor.exibirMenu();
							break;
						case 4: gcli.exibirMenu();
							break;
						case 5: gvda.exibirMenu();
							break;
						case 6:
							break;
						default: System.out.println("Valor Invalido!");
							break;
						}
					
					
					
				} while (op2!=6);
				
				
			}
		
			
		
			
			
		} while(op!=3);
	}
	
	

}
