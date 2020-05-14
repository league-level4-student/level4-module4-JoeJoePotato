package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PanePolymorph extends Polymorph implements ActionListener{
	PanePolymorph(int x, int y, int h, int w) {
		super(x, y, h, w);
	}


	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(getX(), getY(), getW(), getH());
	}
	public boolean isPane() {
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
