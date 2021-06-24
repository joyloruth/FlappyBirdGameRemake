/**
 * 
 */
package flappyBirdGame.joyloruth.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JPanel;

/**
 * @author Joy LoRuth
 *
 */


public class GamePanel extends JPanel implements KeyListener, ActionListener{
	
	final int WIDTH = 525, HEIGHT = 500;
	int birdHeight = HEIGHT/4;
	int velocity  = 0;
	int accel = 4;
	//static int fix = birdHeight + velocity;
	
	public GamePanel(){
		
		//sets size
		this.setSize(WIDTH, HEIGHT);
		
		//focuses JPanel
		this.setFocusable(true);
		
		//adds keyListener
		addKeyListener(this);
		
		//sets background color
		this.setBackground(Color.BLACK);
		
		new Timer(40, this).start();;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		velocity += accel;
		
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_UP) {
			birdHeight = velocity - 8;
			}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.drawFlappyBird(g);
	}
	
	public void drawFlappyBird(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(150, birdHeight + velocity,50, 50);
	}
	
	

}
