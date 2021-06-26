package flappyBirdGame.joyloruth.com;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPanel extends JPanel{
	JButton button = new JButton(new ImageIcon("score.png"));
	//JButton button = new JButton("Play Game"); 
	JLabel home = new JLabel();
	
	FrontPanel(){
		this.setSize(600,600);
		this.setVisible(true);
		this.setBackground(Color.green);
		
		this.add(button);
		this.add(home);
		ImageIcon icon = new ImageIcon("flappyBird.png");
		//this.setLayout(new FlowLayout());
		home.setIcon(icon);
		
		
	}

}
