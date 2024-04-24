package edu.sabanciuniv.it524.ui.test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass {

	public static void main(String[] args) {
		
		JFrame frm = new JFrame();
		frm.setLocation(100, 100);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(500, 500);
		
		frm.getContentPane().setLayout(null); //Bütün komponentleri size ve location bilgilerini biz vereceğiz
		
		
	   JButton button = new JButton("Press");
	   button.setSize(200, 50);
	   button.setLocation(100, 100);
	   //IT524MouseListener ourListener = new IT524MouseListener();
	  
	   //button.addMouseListener(ourListener);
	   
	   frm.getContentPane().add(button);
		
		frm.setVisible(true);
		

	}

}
