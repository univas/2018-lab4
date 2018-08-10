package br.edu.univas.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CadastroAlunoFrame extends JFrame {

	private JPanel contentPane;
	
	public CadastroAlunoFrame() {
		initialize("Univas 2018");
	}
	
	public CadastroAlunoFrame(String title) {
		initialize(title);
	}
	
	private void initialize(String title) {
		this.setTitle(title);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addPanel();
		addComponents();
	}
	
	private void addPanel() {
		contentPane = new JPanel();
		this.setContentPane(contentPane);
	}
	
	private void addComponents() {
		JButton button = new JButton();
		button.setText("Salvar");
		contentPane.add(button);
	}
	
}
