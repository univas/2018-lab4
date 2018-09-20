package br.edu.univas.frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParImparFrame extends JFrame {

	private JPanel content;
	private JTextField numberTextField;
	private JLabel resultLabel;
	
	public ParImparFrame() {
		this.setTitle("Par ou Ímpar?");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContent();
		addComponents();
	}
	
	private void setContent() {
		content = new JPanel();
		this.setContentPane(content);
	}
	
	private void addComponents() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Número:");
		this.content.add(nameLabel);
		
		numberTextField = new JTextField();
		numberTextField.setColumns(40);
		this.content.add(numberTextField);
		
		JButton printButton = new JButton();
		printButton.setText("Imprimir");
		printButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				classificateNumber();				
			}
		});
		this.content.add(printButton);
		
		resultLabel = new JLabel();
		resultLabel.setPreferredSize(new Dimension(500, 20));
		this.content.add(resultLabel);
	}
	
	private void classificateNumber() {
		String strNumber = numberTextField.getText();

		try {
			int num = Integer.parseInt(strNumber);
			String result = "\"" + num + "\" é ";
			if (num % 2 == 0) {
				result += "par!";
			} else {
				result += "ímpar!";
			}
			
			resultLabel.setText(result);
		} catch (NumberFormatException e) {
			resultLabel.setText("Digite um número válido!");
		}
	}
}
