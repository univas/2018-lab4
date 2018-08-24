package br.edu.univas.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderFrame extends JFrame {
	
	private JPanel content;

	public BorderFrame() {
		this.setTitle("Aprendendo BorderLayout!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 450);
		this.setLocationRelativeTo(null);
		setContent();
		addPanels();
	}
	
	private void setContent() {
		content = new JPanel();
		BorderLayout borderLayout = new BorderLayout();
		content.setLayout(borderLayout);
		this.setContentPane(content);
	}
	
	private void addPanels() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.red);
		northPanel.setPreferredSize(new Dimension(0, 50));
		content.add(northPanel, BorderLayout.NORTH);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.yellow);
		westPanel.setPreferredSize(new Dimension(100, 0));
		content.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.gray);
		centerPanel.setPreferredSize(new Dimension(450, 0));
		content.add(centerPanel, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.green);
		eastPanel.setPreferredSize(new Dimension(150, 0));
		content.add(eastPanel, BorderLayout.EAST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.blue);
		southPanel.setPreferredSize(new Dimension(0, 50));
		content.add(southPanel, BorderLayout.SOUTH);
	}
	
}
