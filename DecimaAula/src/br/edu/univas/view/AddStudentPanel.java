package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddStudentPanel extends JPanel {

	public void addComponents() {
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(nameTextField, gbc);
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		this.add(cpfLabel, gbc);
		
		JTextField cpfTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(cpfTextField, gbc);
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Endereço:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		this.add(addressLabel, gbc);
		
		JTextField addressTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(addressTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		this.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(emailTextField, gbc);
		
		JLabel phoneLabel = new JLabel();
		phoneLabel.setText("Celular:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0.0;
		this.add(phoneLabel, gbc);
		
		JTextField phoneTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(phoneTextField, gbc);
	}
	
	
}
