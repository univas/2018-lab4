package br.edu.univas.main;

import java.sql.SQLException;

import br.edu.univas.controller.MainController;

public class StartApp {

	public static void main(String[] args) {
		try {
			
			MainController controller = new MainController();
			controller.initApp();
			
		} catch (SQLException e) {
			System.out.println("Deu ruim :( ");
			e.printStackTrace();
		}
	}
	
}
