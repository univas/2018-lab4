package br.edu.univas.controller;

import javax.swing.JPanel;

import br.edu.univas.view.AddStudentPanel;

public class AddStudentController {

	private JPanel addStudentPanel;
	
	public AddStudentController() {
		addStudentPanel = new AddStudentPanel();
	}
	
	public JPanel getComponent() {
		return addStudentPanel;
	}
	
}
