package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.listener.SaveButtonListener;

public class AddStudentPanel extends JPanel {

	private JTextField nameTextField;
	private JTextField cpfTextField;
	private JTextField addressTextField;
	private JTextField emailTextField;
	private JTextField phoneTextField;
	private SaveButtonListener listener;
	
	public AddStudentPanel() {
		addComponents();
	}
	
	public void setListener(SaveButtonListener listener) {
		this.listener = listener;
	}
	
	private void addComponents() {
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(nameLabel, gbc);
		
		nameTextField = new JTextField();
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
		
		cpfTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(cpfTextField, gbc);
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Endere�o:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		this.add(addressLabel, gbc);
		
		addressTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(addressTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		this.add(emailLabel, gbc);
		
		emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(emailTextField, gbc);
		
		JLabel phoneLabel = new JLabel();
		phoneLabel.setText("Celular:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0.0;
		this.add(phoneLabel, gbc);
		
		phoneTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		this.add(phoneTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listener.save();
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		this.add(saveButton, gbc);
	}

	public JTextField getNameTextField() {
		return nameTextField;
	}

	public JTextField getCpfTextField() {
		return cpfTextField;
	}

	public JTextField getAddressTextField() {
		return addressTextField;
	}

	public JTextField getEmailTextField() {
		return emailTextField;
	}

	public JTextField getPhoneTextField() {
		return phoneTextField;
	}
	
}
