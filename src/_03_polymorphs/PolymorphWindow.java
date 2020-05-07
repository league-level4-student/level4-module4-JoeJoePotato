package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
   Polymorph one;
   Polymorph two;
   Polymorph three;
   Polymorph four;
   Polymorph five;
   Polymorph six;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 Random r=new Random();
   	 ArrayList<Polymorph> ps=new ArrayList<Polymorph>();
    one=new RedPolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
  four=new RedPolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
   two=new BluePolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
   three=new BluePolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
   five=new MovingPolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
   	 six=new MovingPolymorph(r.nextInt(300),r.nextInt(300),r.nextInt(200),r.nextInt(200));
   	 ps.add(one);
   	 ps.add(two);
   	 ps.add(three);
   	ps.add(four);
   	ps.add(five);
   	ps.add(six);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);

	//draw polymorph
   	 one.draw(g);
   	two.draw(g);
   	three.draw(g);
   	four.draw(g);
   	five.draw(g);
   	six.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 one.update();
   	two.update();
   	three.update();
   	four.update();
   	five.update();
   	six.update();
   	 
    }
}
