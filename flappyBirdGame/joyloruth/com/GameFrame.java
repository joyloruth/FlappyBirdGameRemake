package flappyBirdGame.joyloruth.com;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
		setSize(500,500);
		setVisible(true);
		setTitle("FlappyBird Game");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		add(new GamePanel());
	}

	

}
