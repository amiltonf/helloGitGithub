package model;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Pessoa> pessoas;
	
	public static void createBase() throws UsuarioException, SenhaException{
		pessoas = new ArrayList<>();
		inicializarBase();
	}
	
	private static void inicializarBase() throws UsuarioException, SenhaException{
		adicionarUsuario(new Usuario("Maria Silva", "111.111.111-11", new Telefone(55, 81, "99999-1111"), "mariasilva", GerenciadorSenha.gerarSenha()));
		adicionarUsuario(new Usuario("Godofredo Silva", "222.222.222-22", new Telefone(55, 81, "99999-1111"), "gsilva", "G1234567"));
	}
	
	public static boolean isUsuario(String login) {
		for (Pessoa pessoaCurrent:pessoas) {
			if (((Usuario) pessoaCurrent).getLogin().equalsIgnoreCase(login))
				return true;
	}
		return false;
	}
	
	public static boolean isUsuario(String login, String senha) {
		for (Pessoa pessoaCurrent:pessoas) {
			if (((Usuario) pessoaCurrent).getLogin().equalsIgnoreCase(login) && ((Usuario) pessoaCurrent).getSenha().equals(senha))
				return true;
	}
		return false;
	}
		
	
	public static boolean adicionarUsuario(Usuario usuario) throws UsuarioException{
		
		if (usuario == null)
			throw new UsuarioException(Mensagem.USER_NULL_ERROR);
		if (usuario.getLogin() == null)
		throw new UsuarioException(Mensagem.USER_NULL_ERROR);
		
		for (Pessoa pessoaCurrent:pessoas) {
			if (((Usuario) pessoaCurrent).getLogin().equalsIgnoreCase(usuario.getLogin()))
				throw new UsuarioException(Mensagem.USER_EXIST_ERROR);
				
		}
		
		pessoas.add(usuario);
		return true;
	}
	
	public static ArrayList<String> listTelefones(){
		ArrayList<String> telefones = new ArrayList<>();
		
		for (Pessoa pessoaCurrent:pessoas)
			telefones.add(pessoaCurrent.getTelefone().toString());
		
		return telefones;
		
	}
	
	public static ArrayList<String> listLogin(){
		
		ArrayList<String> logins = new ArrayList<>();
		
		for (Pessoa pessoaCurrent:pessoas)
			logins.add(((Usuario)pessoaCurrent).getLogin());
		
		return logins;
	}
}
