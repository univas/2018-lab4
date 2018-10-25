package br.edu.univas.controller;

import java.util.Arrays;
import java.util.List;

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
	
	public AddStudentController() {
		dao = new StudentDAO();
		addStudentPanel = new AddStudentPanel();
		addStudentPanel.setListener(new SaveButtonListener() {
			
			@Override
			public void save() {
				saveStudent();
			}
		});
	}
	
	private void saveStudent() {
		student = new Student();
		student.setName(addStudentPanel.getNameTextField().getText());
		student.setCpf(addStudentPanel.getCpfTextField().getText());
		student.setEmail(addStudentPanel.getEmailTextField().getText());
		student.setAddress(addStudentPanel.getAddressTextField().getText());
		student.setPhone(addStudentPanel.getPhoneTextField().getText());
		
		dao.save(student);
		clearFields();
	}
	
	private void clearFields() {
		List<JTextField> fields = Arrays.asList(
				addStudentPanel.getNameTextField(), 
				addStudentPanel.getCpfTextField(),
				addStudentPanel.getEmailTextField(),
				addStudentPanel.getAddressTextField(),
				addStudentPanel.getPhoneTextField());
		
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
