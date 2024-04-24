package edu.sabanciuniv.it524.ui.main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import edu.sabanciuniv.it524.ui.test.IT524MouseListener;

public class Piyon extends JLabel{
	
	private int xKoordinat;
	private int yKoordinat;
	
	public Piyon(String renk,int x,int y)
	{
		this.xKoordinat = x;
		this.yKoordinat = y;
		this.setSize(100, 100);
		ImageIcon beyazPiyon = new ImageIcon("piyon-"+renk+".png");
		this.setIcon(beyazPiyon);
		this.setHorizontalAlignment(CENTER);
		this.setVerticalAlignment(CENTER);
		this.setVerticalTextPosition(CENTER);
		this.setHorizontalTextPosition(CENTER);
		IT524MouseListener ourListener = 
				new IT524MouseListener(this.xKoordinat,this.yKoordinat);
		this.addMouseListener(ourListener);
		
	}
}
