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


 

public class Main extends JFrame {
	
	final int HEIGHT = 500, WIDTH = 800;
	
	public static void main(String[] args) {
		
		//FrontFrame frame = new FrontFrame();
		
		Main main = new Main();
		main.build();
		
		
		

	}
	
	void build() {
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		
		label = new JLabel();
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		/*label.setBounds(0, 0, WIDTH,HEIGHT);
		label.setBackground(Color.cyan);
		label.setOpaque(true);*/
		
		panel2.setBounds(0, 0,400, HEIGHT);
		panel2.setBackground(Color.GRAY);
		
		panel.setBounds(301, 0,500, HEIGHT);
		panel.setBackground(Color.black);
		panel.add(label);
		
		
		
		this.add(panel);
		this.add(panel2);
		
		JLabel head = new JLabel("Flappy Bird");
		panel2.add(head);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
