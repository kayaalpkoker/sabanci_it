package edu.sabanciuniv.it524.ui.main;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Kare extends JPanel{
	
	private int defaultSquareSize = 110;
	private int baslangicX = 200;
	private int baslangicY = 60;
	
	public Kare(int x,int y)
	{
		if((y+x)%2==0)
			this.setBackground(Color.white);
		else
			this.setBackground(Color.lightGray);
		this.setLocation(baslangicX+(defaultSquareSize*y), baslangicY+(defaultSquareSize*x));
		this.setSize(defaultSquareSize, defaultSquareSize);
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
		this.setLayout(new FlowLayout());
		
		BosKareListener listener = new BosKareListener(x,y);
		this.addMouseListener(listener);
		
	}
	
	

}
