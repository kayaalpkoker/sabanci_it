package edu.sabanciuniv.it524.ui.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BosKareListener  extends MouseAdapter{
	
	
	private int x;
	private int y;

	public BosKareListener(int x, int y) {
		this.x=x;
		this.y=y;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		Piyon p = new Piyon("siyah", x, y);
		SatrancTahtasi.kareler[x][y].add(p);
		SatrancTahtasi.kareler[x][y].repaint();
		SatrancTahtasi.kareler[x][y].revalidate();
	}
}
