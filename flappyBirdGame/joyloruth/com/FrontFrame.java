package flappyBirdGame.joyloruth.com;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class FrontFrame extends JFrame{
	
	final int WIDTH = 500, HEIGHT = 500;
	
	FrontFrame(){
		
	
	ImageIcon frontIcon = new ImageIcon("flappyBird.png");
	FrontPanel frontPanel = new FrontPanel();
	
	this.setIconImage(frontIcon.getImage());		
	this.setTitle("FlappyBird Game");
	this.setVisible(true);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setSize(WIDTH, HEIGHT);
	this.add(frontPanel);
	
	}

}
