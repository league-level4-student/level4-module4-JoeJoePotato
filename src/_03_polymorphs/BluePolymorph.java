package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y, int h, int w) {
		super(x, y, h, w);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getW(), getH());
	}

	@Override
	protected boolean isPane() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
