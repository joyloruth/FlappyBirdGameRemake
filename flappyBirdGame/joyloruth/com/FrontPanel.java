package flappyBirdGame.joyloruth.com;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPanel extends JPanel implements ActionListener{
	
	final int HEIGHT = 500, WIDTH = 1200;
	
	JLabel homeHeaderLabel = new JLabel();
	JLabel homeBgLabel = new JLabel();
	JLabel demoLabel = new JLabel();
	
	//JButton optionsButton = new JButton(new ImageIcon("options.png"));
	//JButton startButton = new JButton(new ImageIcon("start.png"));
	
	JButton optionsButton = new JButton("OPTIONS");
	JButton startButton = new JButton("START");
	
	ImageIcon homeHeaderImage = new ImageIcon("menuHeader.png");
	ImageIcon homeBgImage = new ImageIcon("fbbg.png");
	

	
	FrontPanel(){
		
		this.setVisible(true);
		this.setSize(WIDTH, HEIGHT);
		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30,30));
		this.setBackground(Color.black);
		
		
		//labels
		this.add(homeHeaderLabel);
		this.add(homeBgLabel);
		
		///buttons
		this.add(startButton);
		this.add(optionsButton);
		
		startButton.setBackground(Color.orange);
		startButton.setFont(new Font("Sans Serif", Font.PLAIN, 30));
		optionsButton.setBackground(Color.orange);
		optionsButton.setFont(new Font("Sans Serif", Font.PLAIN, 30));
		
		homeHeaderLabel.setIcon(homeHeaderImage);
		homeBgLabel.setIcon(homeBgImage);
		
		startButton.addActionListener(this);
		
		//this.add(demoLabel);
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		GameFrame gf = new GameFrame();
		FrontFrame f = new FrontFrame();
		f.dispose(); 
		
		
		
	
	}
	
}

