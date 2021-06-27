package flappyBirdGame.joyloruth.com;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;




public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Main main = new Main();
		 main.menu(num);
		

	}
	
	public void menu(int num) {
		
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("flappyBird.png");
		frame.setIconImage(icon.getImage());
		FlappyPanel flappyPanel = new FlappyPanel();
		
		frame.setTitle("FlappyBird Game");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800,500);
		FrontPanel fp = new FrontPanel();
		
		
		
		
		
		
		switch(num) {
		case 1:
			frame.add(flappyPanel);
			break;
			
		case 2:
			frame.add(fp);	
			break;
		}
	}

}
