package br.edu.univas.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableColumnModel;

public class CadastroPessoaFrame extends JFrame {

	private JPanel content;
	
	public CadastroPessoaFrame() {
		this.setTitle("Prova");
		this.setSize(500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		createContentPane();
		addComponents();
	}
	
	private void createContentPane() {
		content = new JPanel();
		content.setLayout(new BorderLayout());
		this.setContentPane(content);
	}
	
	private void addComponents() {
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(150, 0));
		westPanel.setBackground(Color.GRAY);
		addWestContent(westPanel);
		content.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		addCenterContent(centerPanel);
		content.add(centerPanel, BorderLayout.CENTER);
	}
	
	private void addWestContent(JPanel panel) {
		for (int i = 1; i <= 10; i++) {
			JButton button = new JButton();
			button.setText("Botão " + i);
			panel.add(button);
		}
	}
	
	private void addCenterContent(JPanel panel) {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 15, 15);
		panel.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		panel.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		panel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		panel.add(saveButton, gbc);

		String[] columnNames = {"Nome", "CPF", "E-mail"};
		
		Object[][] rowData = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
		};
		
		JTable myTable = new JTable(rowData, columnNames);
		myTable.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(myTable);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weighty = 1.0;
		panel.add(scrollPane, gbc);
		
		
	}
	
}
