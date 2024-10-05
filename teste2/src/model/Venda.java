package model;

import java.util.Date;
import java.util.Random;

public class Venda {
	
	private int idVenda;
	private Veiculo veiculo;
	private Vendedor vendedor;
	private Cliente cliente;
	private Date data;
	
	public Venda() {
		this.idVenda = gerarIdAleatorio();
	}
	
	private int gerarIdAleatorio() {
		Random random = new Random();
		return random.nextInt(10000);
	}
	
	 public int getId() {
	        return idVenda;
	    }

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
