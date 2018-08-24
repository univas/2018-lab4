package br.edu.univas.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridBagFrame extends JFrame {

	private JPanel content;
	
	public GridBagFrame() {
		this.setTitle("Aprendendo Grid Bag Layout!");
		this.setSize(700, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContent();
		addComponents();
	}
	
	private void setContent() {
		content = new JPanel();
		GridBagLayout gridBag = new GridBagLayout();
		content.setLayout(gridBag);
		this.setContentPane(content);
	}
	
	private void addComponents() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 15, 15);
		content.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		content.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		content.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		content.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		content.add(saveButton, gbc);
	}
	
}
