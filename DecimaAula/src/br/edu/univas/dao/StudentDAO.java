package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.edu.univas.model.Student;

public class StudentDAO {

	private Connection connection;
	
	public StudentDAO() throws SQLException {
		connection = ConnectionUtil.getConnection();
	}
	
	public void save(Student student) {
		String sql = "insert into student (name, email, cpf, phone, address) "
				+ "values (?, ?, ?, ?, ?)";
		
		int index = 1;
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(index++, student.getName());
			statement.setString(index++, student.getEmail());
			statement.setString(index++, student.getCpf());
			statement.setString(index++, student.getPhone());
			statement.setString(index++, student.getAddress());
			
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Student> getAll() {
		ArrayList<Student> data = new ArrayList<>();
		
		String sql = "select * from student";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Student student = new Student();
				student.setName(resultSet.getString("name"));
				student.setCpf(resultSet.getString("cpf"));
				student.setEmail(resultSet.getString("email"));
				student.setPhone(resultSet.getString("phone"));
				student.setAddress(resultSet.getString("address"));
				
				data.add(student);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return data;
	}
	
}
