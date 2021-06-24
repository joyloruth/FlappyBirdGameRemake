/**
 * 
 */
package flappyBirdGame.joyloruth.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 * @author Joy LoRuth
 *
 */


public class GamePanel extends JPanel implements KeyListener, ActionListener{
	
	final int WIDTH = 525, HEIGHT = 500;
	
	GamePanel(){
		
		this.setSize(WIDTH, HEIGHT);
		this.setFocusable(true);
		addKeyListener(this);
		this.setBackground(Color.BLACK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
