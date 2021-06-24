package flappyBirdGame.joyloruth.com;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("FlappyBird Game");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
		new GameFrame();

	}

}
