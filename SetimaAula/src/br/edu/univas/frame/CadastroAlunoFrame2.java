package br.edu.univas.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAlunoFrame2 extends JFrame {

	private JPanel content;
	private JLabel nameLabel;
	private int count = 0;
	
	public CadastroAlunoFrame2() {
		this.setTitle("Cadastro de Aluno");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContent();
		addComponents();
	}
	
	private void setContent() {
		content = new JPanel();
		content.setLayout(new GridBagLayout());
		this.setContentPane(content);
	}
	
	private void addComponents() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		nameLabel = new JLabel();
		nameLabel.setText("Quantidade de click: " + count);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 10, 10);
		content.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		content.add(nameTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		//JButtonActionListener listener = new JButtonActionListener();
		//saveButton.addActionListener(listener);
		saveButton.addActionListener(new JButtonActionListener());
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		content.add(saveButton, gbc);
	}
	
	private class JButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			nameLabel.setText("Quantidade de click: " + count);
		}
	}

}
