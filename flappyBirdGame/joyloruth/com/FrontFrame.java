package flappyBirdGame.joyloruth.com;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FrontFrame extends JFrame{
	
	final int WIDTH = 500, HEIGHT = 720;
	
	FrontFrame(){
	JPanel panel = new JPanel();
	panel.setSize(100, 100);
	panel.setVisible(true);
	panel.setBackground(Color.blue);
	
	
	ImageIcon frontIcon = new ImageIcon("flappyBird.png");
	FrontPanel frontPanel = new FrontPanel();
	
	this.setIconImage(frontIcon.getImage());		
	this.setTitle("FlappyBird Game");
	this.setVisible(true);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setSize(WIDTH, HEIGHT);
	this.setResizable(false);
	this.setLayout(null);
	//this.pack();
	this.add(frontPanel);
	
	//this.add(panel);
	
	}

}
