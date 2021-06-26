package flappyBirdGame.joyloruth.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Joy LoRuth
 *
 */

public class FlappyPanel extends JPanel implements KeyListener, ActionListener{
	
	final int WIDTH = 525, HEIGHT = 550;
	int flappyHeight = HEIGHT/4;
	int velocity  = 0;
	int acceleration = 4;
	int shift = 8;
	int fall = 15;
	
	
	
	public FlappyPanel() {
		//t.start();
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);
		this.setBackground(Color.cyan);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		
		
		new Timer(40, this).start();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		shift = shift + 2; ;
		
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


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {velocity = -9; }
	    if(code == KeyEvent.VK_RIGHT) {shift = 80; }
	    if(code == KeyEvent.VK_LEFT) {shift = -20; }
	}
	
	


	@Override
	public void keyReleased(KeyEvent e) {
     
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	
	public void drawBarriers(Graphics g) {
		g.setColor(Color.green);
		g.fill3DRect(80, 0, 90, 550, true);
	}
	


	

	

}
