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
	int flappyV  = 0;
	int flappyA = 4;
	
	
	
	public FlappyPanel() {
		//t.start();
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		
		
		new Timer(40, this).start();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		flappyV  = flappyV + flappyA;
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.drawFlappyBird(g);
	}
	
	public void drawFlappyBird(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(75, flappyHeight + flappyV,40, 40);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {flappyV = -9; }

		
	    if(code == KeyEvent.VK_DOWN) {	
		         flappyV = 9;
		         }
	}

	@Override
	public void keyReleased(KeyEvent e) {
     int code = e.getKeyCode();
		
	    if(code == KeyEvent.VK_UP) {	
		         flappyV = -20;
		         }
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	
	
	


	

	

}
