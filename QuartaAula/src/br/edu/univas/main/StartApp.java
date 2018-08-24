package br.edu.univas.main;

import javax.swing.JFrame;

import br.edu.univas.frame.BorderFrame;
import br.edu.univas.frame.FlowFrame;
import br.edu.univas.frame.GridBagFrame;

public class StartApp {

	public static void main(String[] args) {
		JFrame frame = null;
		//frame = new BorderFrame();
		//frame = new FlowFrame();
		frame = new GridBagFrame();
		frame.setVisible(true);
	}
	
}
