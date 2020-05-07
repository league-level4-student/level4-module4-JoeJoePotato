package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    Polymorph(int x, int y, int height, int width){
   	 this.x = x;
   	 this.y = y;
   	 this.height=height;
   	 this.width=width;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int n) {
    	x=n;
    }
    public void setY(int n) {
    	y=n;
    }
    public int getW() {
    	return width;
    }
    public void setW(int n) {
    	width=n;
    }
    public int getH() {
    	return height;
    }
    public void setH(int n) {
    	height=n;
    }
}
