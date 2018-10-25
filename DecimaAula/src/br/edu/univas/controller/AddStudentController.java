package br.edu.univas.controller;

import javax.swing.JPanel;

import br.edu.univas.listener.SaveButtonListener;
import br.edu.univas.model.Student;
import br.edu.univas.view.AddStudentPanel;

public class AddStudentController {

	private AddStudentPanel addStudentPanel;
	private Student student;
	
	public AddStudentController() {
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
	}
	
	public JPanel getComponent() {
		return addStudentPanel;
	}
	
}
