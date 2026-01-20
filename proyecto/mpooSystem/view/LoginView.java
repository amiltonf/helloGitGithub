package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;

public class LoginView extends JFrame{
	JLabel mpooLabel;
	Icon mpooIcon;
	JButton logarButton;
	JButton sairButton;
	
	public LoginView() {
		super();
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(200,140);
		
		
		logarButton = new JButton("Logar");
		sairButton = new JButton("Sair");
		
		logarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuView menuView = new MenuView();
				
				
			}
		});
		
		
		add(logarButton);
		add(sairButton);
		
	}

	
}
