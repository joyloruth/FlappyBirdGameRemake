package flappyBirdGame.joyloruth.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Joy LoRuth
 *
 */

public class FlappyPanel extends JPanel implements KeyListener, ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	final int WIDTH = 800, HEIGHT = 550;
	int flappyHeight = HEIGHT/4;
	final int BARRIER_WIDTH = 90;
	int velocity  = 0;
	int acceleration = 4;
	int shift = 8;
	int fall = 15;
	int wallPosition = 200;
	int shiftWall =  5; 
	JLabel score = new JLabel();
	ImageIcon scoreIcon = new ImageIcon("score.png");
	
	
	
	
	
	public FlappyPanel() {
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
		wallPosition = wallPosition - shiftWall;
		
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
		g.fill3DRect(wallPosition, 0, BARRIER_WIDTH, HEIGHT, true);
	}
	


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {velocity = -9; }
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
