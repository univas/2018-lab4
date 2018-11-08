package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.univas.model.Student;

public class StudentDAO {

	private Connection connection;
	
	private static ArrayList<Student> data = new ArrayList<>();
	
	public StudentDAO() throws SQLException {
		connection = ConnectionUtil.getConnection();
	}
	
	public void save(Student student) {
		data.add(student);
	}
	
	public ArrayList<Student> getAll() {
		return data;
	}
	
}
