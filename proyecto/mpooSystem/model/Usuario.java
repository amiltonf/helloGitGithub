package model;

public class Usuario extends Pessoa implements GerenciadorSenha {

	private String login;
	private String senha;
	
	public Usuario(String nome, String cpf, Telefone telefone, String login, String senha) throws SenhaException{
		super(nome, cpf, telefone);
		if (senha.length()<8)
			throw new SenhaException(Mensagem.SENHA_ERROR);
		this.login = login;
		this.senha = senha;
	}

	public Usuario(String nome, String cpf, String sexo, Telefone telefone, String login, String senha) throws SenhaException{
		super(nome, cpf, sexo, telefone);
		if (senha.length()<8)
			throw new SenhaException(Mensagem.SENHA_ERROR);
		this.login = login;
		this.senha = senha;
	}
	
	public String gerarSenha(int qtdeMaximaCaracteres) {
		StringBuilder senha = new StringBuilder();
		
		for (int i = 0; i < qtdeMaximaCaracteres; i++) {
			int posicao = (int) (Math.random() * CARACTERS.length);
			senha.append(CARACTERS[posicao]);
		}
		return senha.toString();
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	
	
	
	
}
