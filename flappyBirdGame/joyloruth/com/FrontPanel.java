package flappyBirdGame.joyloruth.com;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPanel extends JPanel implements ActionListener{
	
	
	final int HEIGHT = 550, WIDTH = 500;
	
	JLabel homeHeaderLabel = new JLabel();
	JLabel homeBirdLabel = new JLabel();
	JLabel copyRightLabel = new JLabel("Copyright(C) 2021 by Joy LoRuth");
	
	JButton optionsButton = new JButton(new ImageIcon("options.png"));
	JButton startButton = new JButton(new ImageIcon("start.png"));
	
	ImageIcon homeHeaderImage = new ImageIcon("menuHeader.png");
	ImageIcon homeBirdImage = new ImageIcon("flappyBird.png");
	

	
	FrontPanel(){
		
		this.setVisible(true);
		this.setSize(WIDTH, HEIGHT);
			
		this.add(homeHeaderLabel);
		this.add(startButton);
		this.add(optionsButton);
		this.add(copyRightLabel);
		//this.add(homeBirdLabel);
		
		this.setBackground(Color.black);
		
		startButton.setBackground(Color.orange);
		optionsButton.setBackground(Color.orange);
		
		//startButton.setFont(new Font("Sans Serif", Font.PLAIN, 30));
		//optionsButton.setFont(new Font("Sans Serif", Font.PLAIN, 30));*/
		
		homeHeaderLabel.setIcon(homeHeaderImage);
		homeBirdLabel.setIcon(homeBirdImage);
		
		startButton.addActionListener(this);
		
		
		copyRightLabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		GameFrame gf = new GameFrame();
		FrontFrame f = new FrontFrame();
		f.dispose(); 
		
		
		
	
	}
	
}

