package flappyBirdGame.joyloruth.com;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("flappyBird.png");
		frame.setIconImage(icon.getImage());
		FlappyPanel flappyPanel = new FlappyPanel();
		frame.add(flappyPanel);
		frame.setTitle("FlappyBird Game");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		

	}

}
