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

public class GamePanel extends JPanel implements KeyListener, ActionListener{
	
	final int WIDTH = 525, HEIGHT = 550;
	int flappyHeight = HEIGHT/4;
	int flappyV  = 0;
	int flappyA = 4;
	
	
	public GamePanel(){
		
		
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);
		this.grabFocus();
		this.setFocusable(true);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		
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
		g.setColor(Color.red);
		g.fillRect(75, flappyHeight + flappyV,50, 50);
	}
	
	


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		System.out.println(code);
		
	if(code == KeyEvent.VK_UP) {	
		 flappyV = -9; 
		}
	
	System.out.println(code);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		
		int code = e.getKeyCode();
		System.out.println(code);
		
	}
	
	
	


	

	

}
