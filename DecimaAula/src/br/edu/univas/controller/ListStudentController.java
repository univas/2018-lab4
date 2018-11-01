package br.edu.univas.controller;

import java.awt.Component;

import br.edu.univas.dao.StudentDAO;
import br.edu.univas.view.ListStudentPanel;

public class ListStudentController {

	private ListStudentPanel panel;
	private StudentDAO dao;
	
	public ListStudentController() {
		dao = new StudentDAO();
		panel = new ListStudentPanel(dao.getAll());
	}
	
	public Component getComponent() {
		return panel;
	}
	
}
