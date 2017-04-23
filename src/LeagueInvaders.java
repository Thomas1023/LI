import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import leagueInvaders.GamePanel;

public class LeagueInvaders {
	JFrame gf = new JFrame();
	GamePanel g = new GamePanel();

	public static void main(String[] args) {
		LeagueInvaders LeagueInvaders = new LeagueInvaders();

		LeagueInvaders.setup();

	}

	public void setup() {
		gf.setVisible(true);
		gf.setSize(500, 800);
		gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gf.addKeyListener(g);
		
	}

	public LeagueInvaders() {

	}

}
