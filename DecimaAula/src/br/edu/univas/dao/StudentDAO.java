package br.edu.univas.dao;

import java.util.ArrayList;

import br.edu.univas.model.Student;

public class StudentDAO {

	private static ArrayList<Student> data = new ArrayList<>();
	
	public void save(Student student) {
		data.add(student);
	}
	
	public ArrayList<Student> getAll() {
		return data;
	}
	
}
