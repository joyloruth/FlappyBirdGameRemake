package flappyBirdGame.joyloruth.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Joy LoRuth
 *
 */

public class GamePanel extends JPanel implements KeyListener, ActionListener{
	
	Random rand = new Random();
	
	final int WIDTH = 1200, HEIGHT = 550;
	int flappyHeight = HEIGHT/4;
	final int BARRIER_WIDTH = 90;
	int barrierPosition = 500;
	
	int drop  = 0;
	int up = 7;
	int shift = 8;
	int fall = 1;
	
	int shiftBarrier =  5; 
	int barrierGap = rand.nextInt(HEIGHT);
	
	JLabel score = new JLabel();
	ImageIcon scoreIcon = new ImageIcon("score.png");
	JLabel scoreLabel = new JLabel();
	
	int count = 0;
	
	
	JLabel label = new JLabel();
	
	
	
	

	
	
	
	
	
	public GamePanel() {
		
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);
		this.setBackground(Color.cyan);
		this.setFocusable(true);
		this.setLayout(null);
		this.setFocusTraversalKeysEnabled(false);
		
		this.add(label);
		this.add(score);
		new Timer(40, this).start();
		
		score.setIcon(scoreIcon);
		
		
		
		label.setBounds(20, 20, 300, 40);
		label.setFont(new Font("Sans Serif", Font.BOLD, 30));
		label.setText("scpre" + count);
		//score.setBounds(30, 30,1000,1000);
		
		
		
		
		
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//shift = shift + 2; 
		barrierPosition = barrierPosition - shiftBarrier;
		
		//drop  = drop + fall;
		//drop  = drop + acceleration;
		
		//flappyHeight = flappyHeight + drop;
		
		drop = drop + 8;
		
				
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.drawBarriers(g);
		this.drawFlappyBird(g);
		this.drawBorder(g);
		
		
		
	}
	
	public void drawFlappyBird(Graphics g){
		g.setColor(Color.yellow);
		
		g.fill3DRect(flappyHeight , flappyHeight + drop,25, 25, true);
	}
	
	public void drawBarriers(Graphics g) {
		g.setColor(Color.green);
		g.fill3DRect(barrierPosition, 0, BARRIER_WIDTH, HEIGHT, true);
		
		g.setColor(Color.cyan);
		g.fillRect(barrierPosition, barrierGap, BARRIER_WIDTH, 100);
		
		
		
	}
	


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {drop = -3;
	    count++;}
	  
	    if(code == KeyEvent.VK_DOWN) {drop = 3; }
	    
	  
	}
	
	
	void drawBorder(Graphics g){
		g.drawLine(10, 10, 10, 10);
		g.setColor(Color.BLACK);
	}
	
	
	

	@Override
	public void keyReleased(KeyEvent e) {
     
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	

}
