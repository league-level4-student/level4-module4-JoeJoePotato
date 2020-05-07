package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
int originalx;
int originaly;
int circled;
	CirclePolymorph(int x, int y, int h, int w, int circled) {
		super(x, y, h, w);
	this.originalx=x;
	this.originaly=y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		if(getX()<originalx+(circled/2)) {
			if(getX()<originalx+(circled/4)) {
				setX(getX()+2);
				setY(getY()+1);
			}else if(getX()>originalx+(circled/4)) {
				setX(getX())
			}
		}
		g.fillRect(getX(), getY(), getW(), getH());
	}
}
