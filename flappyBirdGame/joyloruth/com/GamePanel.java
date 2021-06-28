package flappyBirdGame.joyloruth.com;

import java.awt.Color;
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
	int velocity  = 0;
	int acceleration = 4;
	int shift = 8;
	int fall = 1;
	int barrierPosition = 500;
	int shiftBarrier =  5; 
	JLabel score = new JLabel();
	ImageIcon scoreIcon = new ImageIcon("score.png");
	JLabel scoreLabel = new JLabel();
	int count = 0;
	
	int barrierGap = rand.nextInt(HEIGHT);
	
	
	

	
	
	
	
	
	public GamePanel() {
		//t.start();
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);
		this.setBackground(Color.cyan);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		
		
		new Timer(40, this).start();
		this.add(score);
		score.setIcon(scoreIcon);
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		shift = shift + 2; 
		barrierPosition = barrierPosition - shiftBarrier;
		
		velocity  = velocity + fall;
		velocity  = velocity + acceleration;
				
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.drawBarriers(g);
		this.drawFlappyBird(g);
		
	}
	
	public void drawFlappyBird(Graphics g){
		g.setColor(Color.yellow);
		
		g.fill3DRect(shift, flappyHeight + velocity,25, 25, true);
	}
	
	public void drawBarriers(Graphics g) {
		g.setColor(Color.green);
		g.fill3DRect(barrierPosition, 0, BARRIER_WIDTH, HEIGHT, true);
		
		g.setColor(Color.cyan);
		g.fillRect(barrierPosition, barrierGap, BARRIER_WIDTH, 75);
		
		
		
	}
	


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {
	    	velocity = -3; 
	    	count++;
	    }
	    if(code == KeyEvent.VK_RIGHT) {shift = 80; }
	    if(code == KeyEvent.VK_LEFT) {shift = -1; }
	}
	
	

	
	
	

	@Override
	public void keyReleased(KeyEvent e) {
     
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	

}
