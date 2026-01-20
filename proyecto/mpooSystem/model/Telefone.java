package model;

public class Telefone {
	int ddi;
	int ddd;
	String numero;
	
	public Telefone(int ddi, int ddd, String numero) {
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: \n +" + ddi + " (" + ddd + ") " + numero;
	}
	
	
	
}
