package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.model.Student;

public class ListStudentPanel extends JPanel {

	private JTable table;
	
	public ListStudentPanel() {
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
		columns.add("Data de Nascimento");
	
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

	public void updateStudents(ArrayList<Student> students) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		model.setRowCount(0);
		
		for (Student student : students) {
			model.addRow(new Object[] {
					student.getName(),
					student.getCpf(),
					student.getEmail(),
					student.getAddress(),
					student.getPhone(),
					student.getDataNascimento()
			});
		}
	}
	
}
