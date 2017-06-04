
.import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	GameObject Obj = new GameObject();
	Timer t = new Timer(1000 / 60, this);


	public void paintComponent(Graphics g) {
		Obj.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Typed");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed");

	}
	public void keyPressed1(KeyEvent a) {
		Obj.x--;

	}
	public void keyPressed11(KeyEvent d) {
		Obj.x++;

	}


	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released");

	}

}
