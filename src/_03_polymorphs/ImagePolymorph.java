package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	BufferedImage image;
	Boolean needImage=true;
	Boolean gotImage=false;
	ImagePolymorph(int x, int y, int h, int w) {
		super(x, y, h, w);
	if(needImage) {
	loadImage("download.jpg");
	}
		
	}

	@Override
	public void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, getX(), getY(), getW(), getH(), null);
		} else {
			g.setColor(Color.BLACK);
			g.fillRect(getX(), getY(),getW(), getH());
		}
	
		}
	
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}

	@Override
	protected boolean isPane() {
		// TODO Auto-generated method stub
		return false;
	}
}
