package br.edu.univas.controller;

import br.edu.univas.listener.TopButtonListener;
import br.edu.univas.view.MainView;

public class MainController {

	private MainView mainView;
	
	public MainController() {
		mainView = new MainView();
	}
	
	public void initApp() {
		mainView.setListener(new TopButtonListener() {
			
			@Override
			public void showListView() {
				showListStudentPanel();
			}
			
			@Override
			public void showAddView() {
				showAddStudentPanel();
			}
		});
		mainView.setVisible(true);
	}
	
	private void showAddStudentPanel() {
		AddStudentController controller = new AddStudentController();
		mainView.getCenterPanel().removeAll();
		mainView.getCenterPanel().add(controller.getComponent());
		mainView.getCenterPanel().revalidate();
		//mainView.getCenterPanel().repaint();
	}
	
	private void showListStudentPanel() {
		
	}
	
}
