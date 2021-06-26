package flappyBirdGame.joyloruth.com;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPanel extends JPanel{
	
	JLabel homeIcon = new JLabel();
	JButton startButton = new JButton(new ImageIcon("start.png"));
	JButton optionsButton = new JButton(new ImageIcon("options.png"));
	
	
	
	FrontPanel(){
		
		this.setSize(600,600);
		this.setVisible(true);
		this.setBackground(Color.black);
		//this.setLayout(new CardLayout());
		
		this.add(homeIcon);
		this.add(startButton);
		this.add(optionsButton);
		
		ImageIcon icon = new ImageIcon("menuHeader.png");
		
		
		homeIcon.setIcon(icon);
		
		
	}

}
