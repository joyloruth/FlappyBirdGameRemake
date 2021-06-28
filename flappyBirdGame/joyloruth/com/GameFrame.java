package flappyBirdGame.joyloruth.com;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	final int WIDTH = 1200, HEIGHT = 500;
	
	GameFrame(){
	GamePanel gamePanel = new GamePanel();
	
	ImageIcon gameIcon = new ImageIcon("peep.png");
	this.setIconImage(gameIcon.getImage());
	this.setTitle("FlappyBird Game");
	this.setVisible(true);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setSize(WIDTH, HEIGHT);
	this.add(gamePanel); 
	
	
	
	}
}
