package br.edu.univas.frame;

import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
		listScrollPane.setPreferredSize(new Dimension(450, 90));
		listScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.add(listScrollPane);
		
		JLabel courseLabel = new JLabel();
		courseLabel.setText("Curso:");
		content.add(courseLabel);
		
		JComboBox<String> courseCombobox = new JComboBox<>();
		courseCombobox.addItem("Sistemas de Informação");
		courseCombobox.addItem("Medicina");
		courseCombobox.addItem("Letras");
		courseCombobox.addItem("Matemática");
		courseCombobox.setPreferredSize(new Dimension(400, 30));
		content.add(courseCombobox);
		
		JLabel dayOfWeekLabel = new JLabel();
		dayOfWeekLabel.setText("Dia da semana:");
		content.add(dayOfWeekLabel);
		
		JCheckBox mondayCheckBox = new JCheckBox();
		mondayCheckBox.setText("Segunda-feira");
		content.add(mondayCheckBox);
		
		JCheckBox tuesdayCheckBox = new JCheckBox();
		tuesdayCheckBox.setText("Terça-feira");
		content.add(tuesdayCheckBox);
		
		JCheckBox wednesdayCheckBox = new JCheckBox();
		wednesdayCheckBox.setText("Quarta-feira");
		content.add(wednesdayCheckBox);

		List<String> days = new ArrayList<>();
		days.add("Segunda");
		days.add("Segunda1");
		days.add("Segunda2");
		days.add("Segunda3");
		days.add("Segunda4");
		createCheckBox(days);
		
		JLabel labelHour = new JLabel();
		labelHour.setText("Hora:");
		content.add(labelHour);
		
		JRadioButton radioButtonMorning = new JRadioButton();
		radioButtonMorning.setText("08:00 - 12:00");
		content.add(radioButtonMorning);
		
		JRadioButton radioButtonAfternoon = new JRadioButton();
		radioButtonAfternoon.setText("12:00 - 18:00");
		content.add(radioButtonAfternoon);
		
		JRadioButton radioButtonEvening = new JRadioButton();
		radioButtonEvening.setText("18:00 - 00:00");
		content.add(radioButtonEvening);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButtonMorning);
		group.add(radioButtonAfternoon);
		group.add(radioButtonEvening);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar!");
		content.add(saveButton);
		
		String[] columnNames = {"Nome", "Idade", "E-mail"};
		
		Object[][] rowData = {
				{"Maria", "12", "maria@gmail.com"},
				{"José", "13", "jose@gmail.com"},
				{"João", "14", "joao@gmail.com"}
		};
		
		JTable table = new JTable(rowData, columnNames);
		
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tableScroll.setPreferredSize(new Dimension(450, 100));
		content.add(tableScroll);
		
	}
	
	private void createCheckBox(List<String> daysOfWeek) {
		for (String dayOfWeek : daysOfWeek) {
			JCheckBox wednesdayCheckBox = new JCheckBox();
			wednesdayCheckBox.setText(dayOfWeek);
			content.add(wednesdayCheckBox);
		}
	}
	
}
