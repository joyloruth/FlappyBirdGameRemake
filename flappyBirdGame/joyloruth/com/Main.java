package flappyBirdGame.joyloruth.com;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		FlappyPanel flappyPanel = new FlappyPanel();
		frame.add(flappyPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		

	}

}
