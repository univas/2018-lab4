package br.edu.univas.frame;

import java.text.NumberFormat;

import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class TelaPrincipal extends JFrame {

	private JPanel content;
	
	public TelaPrincipal() {
		this.setTitle("Aula 3");
		this.setSize(500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setPane();
		addComponents();
	}
	
	private void setPane() {
		content = new JPanel();
		this.setContentPane(content);
	}
	
	private void addComponents() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		content.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(38);
		content.add(nameTextField);
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Senha:");
		content.add(passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setColumns(38);
		content.add(passwordField);
		
		JLabel labelPercent = new JLabel();
		labelPercent.setText("Taxa (%)");
		content.add(labelPercent);
		
		NumberFormat percentFormat = NumberFormat.getNumberInstance();
		percentFormat.setMinimumFractionDigits(3);
		percentFormat.setMaximumFractionDigits(6);
		
		JFormattedTextField formatTextField = new JFormattedTextField(percentFormat);
		formatTextField.setColumns(38);
		content.add(formatTextField);
		
		JLabel labelDescription = new JLabel();
		labelDescription.setText("Descrição:");
		content.add(labelDescription);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(35);
		textArea.setRows(10);
		textArea.setLineWrap(true);
		
		JScrollPane textAreaScroll = new JScrollPane(textArea);
		textAreaScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		textAreaScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.add(textAreaScroll);
		
		DefaultListModel<String> monthListModel = new DefaultListModel<>();
		monthListModel.addElement("Janeiro");
		monthListModel.addElement("Fevereiro");
		monthListModel.addElement("Março");
		monthListModel.addElement("Abril");
		monthListModel.addElement("Maio");
		monthListModel.addElement("Junho");
		
		JList<String> monthList = new JList<>();
		monthList.setModel(monthListModel);
		monthList.setVisibleRowCount(4);
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane listScrollPane = new JScrollPane(monthList);
		listScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.add(listScrollPane);
		
	}
	
}
