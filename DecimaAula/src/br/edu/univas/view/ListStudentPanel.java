package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import br.edu.univas.model.Student;

public class ListStudentPanel extends JPanel {

	private JTable table;
	
	public ListStudentPanel(List<Student> students) {
		addComponents();
	}
	
	private void addComponents() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel headerLabel = new JLabel();
		headerLabel.setText("Alunos Cadastrados");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(headerLabel, gbc);
		
		Vector<String> columns = new Vector<>();
		columns.add("Nome");
		columns.add("CPF");
		columns.add("E-mail");
		columns.add("Endereço");
		columns.add("Celular");
	
		table = new JTable(null, columns);
		
		JScrollPane tableScrollPane = new JScrollPane(table);
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		this.add(tableScrollPane, gbc);
	}
	
}
