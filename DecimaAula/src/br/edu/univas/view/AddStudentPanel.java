package br.edu.univas.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddStudentPanel extends JPanel {

	public void addComponents() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		
		JTextField nameTextField = new JTextField();
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF:");
		
		JTextField cpfTextField = new JTextField();
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Endereço:");
		
		JTextField addressTextField = new JTextField();
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		
		JTextField emailTextField = new JTextField();
		
		JLabel phoneLabel = new JLabel();
		phoneLabel.setText("Celular:");
		
		JTextField phoneTextField = new JTextField();
	}
	
	
}
