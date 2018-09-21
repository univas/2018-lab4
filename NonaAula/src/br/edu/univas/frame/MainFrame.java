package br.edu.univas.frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class MainFrame extends JFrame {

	private JPanel content;
	private JTextArea textArea;
	
	public MainFrame() {
		this.setTitle("Aprendendo Swing");
		this.setSize(400, 300);
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
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setPreferredSize(new Dimension(350, 210));
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.add(scroll);
		
		JButton addButton = new JButton();
		addButton.setText("Adicionar Texto");
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addText();
			}
		});
		content.add(addButton);
		
		JButton clearButton = new JButton();
		clearButton.setText("Limpar Texto");
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clearText();
			}
		});
		content.add(clearButton);
	}
	
	private void addText() {
		String text = "Univas 2018\n";
		textArea.append(text);
	}
	
	private void clearText() {
		textArea.setText(null);
	}
}
