package br.edu.univas.controller;

import br.edu.univas.view.MainView;

public class MainController {

	private MainView mainView;
	
	public MainController() {
		mainView = new MainView();
	}
	
	public void initApp() {
		mainView.setVisible(true);
	}
	
}
