package edu.sabanciuniv.it524.ui.main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class SatrancTahtasi extends JFrame{
	
	public static Kare[][] kareler = new Kare[8][8];
	
	public SatrancTahtasi()
	{
		this.setTitle("Satranç V 1.0");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500, 1500);
		this.setLocation(200, 200);
		this.getContentPane().setLayout(null);
		for (int x=0;x<8;x++)
		{
			//baslangicY = baslangicY+defaultSquareSize;
			for (int y=0;y<8;y++)
			{
				Kare kare = new Kare(x,y);
				kareler[x][y] = kare;
				this.getContentPane().add(kare);
			}
		}
		
		
	}

	public void ekrandaGoster() {
		this.setVisible(true);
		
	}

	public void taslariDiz() {
		piyonlariDiz();
		
		
	}

	private void piyonlariDiz() {
		
		for(int i=0 ;i<8;i++)
		{
			Piyon beyazPiyon1 = new Piyon("beyaz",6,i);
			this.kareler[6][i].add(beyazPiyon1);	
		}
		
		for(int i=0 ;i<8;i++)
		{
			Piyon siyahPiyon = new Piyon("siyah",1,i);
			this.kareler[1][i].add(siyahPiyon);	
		}
	}

}
