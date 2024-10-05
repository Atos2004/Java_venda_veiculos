package model;

import java.util.Random;

public class Cliente extends Pessoa {
	
	private int idCliente; 
	
	public Cliente(String nome, String CPF, String telefone) {
		super(nome, CPF, telefone);
		this.idCliente = gerarIdAleatorio();
		
	}
	
	private int gerarIdAleatorio() {
		Random random = new Random();
		return random.nextInt(10000);
	}
	
	 public int getId() {
	        return idCliente;
	    }

}
