package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.univas.listener.TopButtonListener;

public class MainView extends JFrame {

	private TopButtonListener listener;
	private JPanel centerPanel;
	
	public MainView() {
		this.setTitle("Cadastro de Aluno");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	public JPanel getCenterPanel() {
		return centerPanel;
	}
	
	public void setListener(TopButtonListener listener) {
		this.listener = listener;
	}
	
	private void addComponents() {
		this.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		addButtons(northPanel);
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
	}
	
	private void addButtons(JPanel panel) {
		Dimension btnDimension = new Dimension(145, 50);
		JButton addButton = new JButton();
		addButton.setText("Cadastrar");
		addButton.setPreferredSize(btnDimension);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listener.showAddView();				
			}
		});
		panel.add(addButton);
		
		JButton listButton = new JButton();
		listButton.setText("Listar");
		listButton.setPreferredSize(btnDimension);
		listButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listener.showListView();
			}
		});
		panel.add(listButton);
	}
	
}
