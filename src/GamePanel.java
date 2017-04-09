import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author league
 *
 */
	
public class GamePanel extends JPanel implements ActionListener{
Timer t = new Timer(1000/60,this);
{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.err.print("fear");
		System.out.print(" leads to ");
		System.err.print("anger\n");
		System.err.print("anger");
		System.out.print(" leads to ");
		System.err.print("hate\n");
		System.err.print("hate");
		System.out.print(" leads to ");
		System.err.print(" the dark side ");
		
	}  
	
}

