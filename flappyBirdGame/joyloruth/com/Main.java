package flappyBirdGame.joyloruth.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Main implements ActionListener {
	
	final static int HEIGHT = 500;
	final static int WIDTH = 1200;
	
	static JLabel label = new JLabel();
	static JButton button = new JButton("Start Game");
	int count = 0;
	static GamePanel gamePanel;

	public static void main(String[] args) {
		
		FrontFrame frame = new FrontFrame();
		
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Main main = new Main();
		 main.menu(num);*/
		
		
		//FRONT PANEL
		/*JFrame frontFrame = new JFrame();
		ImageIcon frontIcon = new ImageIcon("flappyBird.png");
		frontFrame.setIconImage(frontIcon.getImage());		
		frontFrame.setTitle("FlappyBird Game");
		frontFrame.setVisible(true);
		frontFrame.setDefaultCloseOperation(frontFrame.EXIT_ON_CLOSE);
		frontFrame.setSize(WIDTH, HEIGHT);
		frontFrame.add(gamePanel);
		
		
		
		
		//GAME PANEL
		JFrame frame = new JFrame();
		ImageIcon gameIcon = new ImageIcon("flappyBird.png");
		frame.setIconImage(gameIcon.getImage());
		
		
		frame.setTitle("FlappyBird");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.add(gamePanel); */
		
		
		
		
		
		
		

	}
	
	public void menu(int num) {
		
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("flappyBird.png");
		frame.setIconImage(icon.getImage());
		GamePanel gamePanel = new GamePanel();
		
		frame.setTitle("FlappyBird Game");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		FrontPanel fp = new FrontPanel();
		
		switch(num) {
		case 1:
			frame.add(gamePanel);
			break;
			
		case 2:
			frame.add(fp);	
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
