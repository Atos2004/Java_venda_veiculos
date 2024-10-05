package model;

import java.util.Random;

public class Vendedor extends Pessoa {
	
	private int idVendedor; 
	
	public Vendedor(String nome, String CPF, String telefone) {
		super(nome, CPF, telefone);
		this.idVendedor = gerarIdAleatorio();
		
	}
	

	private int gerarIdAleatorio() {
		Random random = new Random();
		return random.nextInt(10000);
	}
	
	 public int getId() {
	        return idVendedor;
	    }
	
}
