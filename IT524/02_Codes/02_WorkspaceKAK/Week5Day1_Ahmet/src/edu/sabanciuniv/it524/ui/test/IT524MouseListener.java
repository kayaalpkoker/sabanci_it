package edu.sabanciuniv.it524.ui.test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class IT524MouseListener extends MouseAdapter{
	
	private int x;
	private int y;
	
	private int clickCount = 1;
	
	public IT524MouseListener(int x2, int y2) {
		this.x=x2;
		this.y=y2;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "Koordinat : "+x +","+y + " Click count : "+this.clickCount);
		clickCount++;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse buton üstünde");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse buton üstünde değil");
	}

}
