package flappyBirdGame.joyloruth.com;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPanel extends JPanel{
	
	
	FrontPanel(){
		
		JPanel p = new JPanel();
		JPanel panel = new JPanel();
			
		JLabel homeHeaderLabel = new JLabel();
		JLabel homeBgLabel = new JLabel();
		
		JButton startButton = new JButton(new ImageIcon("start.png"));
		JButton optionsButton = new JButton(new ImageIcon("options.png"));
		
		ImageIcon homeHeaderImage = new ImageIcon("menuHeader.png");
		ImageIcon homeBgImage = new ImageIcon("fbbg.png");
		
		//this.setBounds(0, 0, 20, 60);
		panel.setSize(300,300);
		panel.setVisible(true);
		panel.setBackground(Color.green);
		this.setVisible(true);
		//this.setBackground(Color.blue);
		//this.setLayout(new CardLayout());
		this.setBackground(Color.red);
		//labels
		this.add(homeHeaderLabel);
		this.add(homeBgLabel);
		
		///buttons
		this.add(startButton);
		this.add(optionsButton);
		
		homeHeaderLabel.setIcon(homeHeaderImage);
		homeBgLabel.setIcon(homeBgImage);
		 
		
		
		
		
	}
	
	
	}
	


