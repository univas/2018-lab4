package br.edu.univas.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroClienteFrame extends JFrame {

	private JPanel content;
	
	public CadastroClienteFrame() {
		this.setTitle("Aprendendo Swing");
		this.setSize(635, 420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContent();
		addComponents();
	}
	
	private void setContent() {
		content = new JPanel();
		content.setLayout(new BorderLayout());
		this.setContentPane(content);
	}
	
	private void addComponents() {
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(0, 120));
		northPanel.setBackground(Color.lightGray);
		addNorthContent(northPanel);
		content.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setLayout(new GridBagLayout());
		addCenterContent(centerPanel);
		content.add(centerPanel, BorderLayout.CENTER);
	}
	
	private void addNorthContent(JPanel panel) {
		String[] buttonContent = {"Produtos", "Acessórios", "Atendimento"};
		
		for(String text : buttonContent) {
			JButton button = new JButton();
			button.setText(text);
			button.setPreferredSize(new Dimension(150, 100));
			panel.add(button);
		}
	}
	
	private void addCenterContent(JPanel panel) {
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(20, 20, 20, 20);
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		panel.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		panel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(saveButton, gbc);
	}
	
}
