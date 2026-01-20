package model;

public interface GerenciadorSenha {

	public static final String[] CARACTERS = {"0", "1", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", ".", "_", "!", "@", "$", "%", "&", "+", "-", "§", "*"};

	public static String gerarSenha() {
		int qtdeMaximaCaracteres = 8;
		StringBuilder senha = new StringBuilder();
		
		for (int i = 0; i < qtdeMaximaCaracteres; i++) {
			int posicao = (int) (Math.random() * CARACTERS.length);
			senha.append(CARACTERS[posicao]);
		}
		return senha.toString();
	}
	
	public abstract String gerarSenha(int qtdeMaximaCaracteres);
		
}
