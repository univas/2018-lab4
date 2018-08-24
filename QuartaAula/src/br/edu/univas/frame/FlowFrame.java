package br.edu.univas.frame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowFrame extends JFrame {

	private JPanel content;
	
	public FlowFrame() {
		this.setTitle("Aprendendo Flow Layout!");
		this.setSize(700, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContent();
		addComponents();
	}
	
	private void setContent() {
		content = new JPanel();
		this.setContentPane(content);
	}
	
	private void addComponents() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name:");
		nameLabel.setPreferredSize(new Dimension(100, 30));
		content.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setPreferredSize(new Dimension(650, 30));
		content.add(nameTextField);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		emailLabel.setPreferredSize(new Dimension(100, 30));
		content.add(emailLabel);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setPreferredSize(new Dimension(650, 30));
		content.add(emailTextField);
	}
	
}
