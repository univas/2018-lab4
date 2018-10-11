package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {

	public MainView() {
		this.setTitle("Cadastro de Aluno");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	private void addComponents() {
		this.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		addButtons(northPanel);
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
	}
	
	private void addButtons(JPanel panel) {
		Dimension btnDimension = new Dimension(145, 50);
		JButton addButton = new JButton();
		addButton.setText("Cadastrar");
		addButton.setPreferredSize(btnDimension);
		panel.add(addButton);
		
		JButton listButton = new JButton();
		listButton.setText("Listar");
		listButton.setPreferredSize(btnDimension);
		panel.add(listButton);
	}
	
}
