package app;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.BaseDados;
import model.SenhaException;
import model.Telefone;
import model.Usuario;
import model.UsuarioException;

public class App {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro de Aparência: O sistema será encerrado.");
			System.exit(0);
		}
		
		try {
			BaseDados.createBase();
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (SenhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		try {
			BaseDados.adicionarUsuario(null);
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		

		try {
			Usuario usuario4 = new Usuario("Maria Silva", "111.111.111-11", new Telefone(55,81,"99999-1111"), "mariasilva", "maria123");
			BaseDados.adicionarUsuario(usuario4);
		} catch (UsuarioException | SenhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		try {
			Usuario usuario5 = new Usuario("João Santos", "333.333.333-33", new Telefone(55,83,"99999-3333"), "joa", "JOA123");
			BaseDados.adicionarUsuario(usuario5);
		} catch (SenhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
	
	}
}
	
		
