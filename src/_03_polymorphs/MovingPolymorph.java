package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{

	MovingPolymorph(int x, int y, int h, int w) {
		super(x, y, h, w);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		Random r=new Random();
		setX(getX()+r.nextInt(20)-r.nextInt(20));
		setY(getY()+r.nextInt(20)-r.nextInt(20));
		g.fillRect(getX(), getY(), getW(), getH());
	}

	@Override
	protected boolean isPane() {
		// TODO Auto-generated method stub
		return false;
	}
}
