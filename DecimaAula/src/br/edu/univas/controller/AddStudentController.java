package br.edu.univas.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.dao.StudentDAO;
import br.edu.univas.listener.SaveButtonListener;
import br.edu.univas.model.Student;
import br.edu.univas.view.AddStudentPanel;

public class AddStudentController {

	private AddStudentPanel addStudentPanel;
	private StudentDAO dao;
	private Student student;
	
	private List<JTextField> fields;
	
	public AddStudentController() throws SQLException {
		dao = new StudentDAO();
		addStudentPanel = new AddStudentPanel();
		addStudentPanel.setListener(new SaveButtonListener() {
			
			@Override
			public void save() {
				saveStudent();
			}
		});
		
		fields = Arrays.asList(
				addStudentPanel.getNameTextField(), 
				addStudentPanel.getCpfTextField(),
				addStudentPanel.getEmailTextField(),
				addStudentPanel.getAddressTextField(),
				addStudentPanel.getPhoneTextField(),
				addStudentPanel.getBirthdayTextField());
	}
	
	private void saveStudent() {
		if (isValidFields()) {			
			student = new Student();
			student.setName(addStudentPanel.getNameTextField().getText());
			student.setCpf(addStudentPanel.getCpfTextField().getText());
			student.setEmail(addStudentPanel.getEmailTextField().getText());
			student.setAddress(addStudentPanel.getAddressTextField().getText());
			student.setPhone(addStudentPanel.getPhoneTextField().getText());
			
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				student.setDataNascimento(sdf.parse(addStudentPanel.getBirthdayTextField().getText()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			dao.save(student);
			clearFields();
		} else {
			JOptionPane.showMessageDialog(addStudentPanel, "Por favor, digite todos os campos!");
		}
	}
	
	private boolean isValidFields() {
		for (JTextField jTextField : fields) {
			if (jTextField.getText() == null || jTextField.getText().trim().equals("")) {
				return false;
			}
		}
		return true;
	}

	private void clearFields() {
		for (JTextField jTextField : fields) {
			clearField(jTextField);
		}
	}
	
	private void clearField(JTextField textField) {
		textField.setText(null);
	}
	
	public JPanel getComponent() {
		return addStudentPanel;
	}
	
}
