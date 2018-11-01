package br.edu.univas.controller;

import java.awt.Component;

import br.edu.univas.listener.TopButtonListener;
import br.edu.univas.view.MainView;

public class MainController {

	private AddStudentController addController;
	private ListStudentController listController;
	private MainView mainView;
	
	public MainController() {
		mainView = new MainView();
		addController = new AddStudentController();
		listController = new ListStudentController();
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
		showAddStudentPanel();
	}
	
	private void showAddStudentPanel() {
		addController = new AddStudentController();
		showPanel(addController.getComponent());
	}
	
	private void showListStudentPanel() {
		listController = new ListStudentController();
		showPanel(listController.getComponent());
	}
	
	private void showPanel(Component component) {
		mainView.getCenterPanel().removeAll();
		mainView.getCenterPanel().add(component);
		mainView.getCenterPanel().revalidate();
	}
	
}
