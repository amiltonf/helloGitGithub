package model;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	protected String sexo;
	protected Telefone telefone;
	
	
	public Pessoa(String nome, String cpf, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}


	public Pessoa(String nome, String cpf, String sexo, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getSexo() {
		return sexo;
	}


	public Telefone getTelefone() {
		return telefone;
	}
	
	
	
	

}
