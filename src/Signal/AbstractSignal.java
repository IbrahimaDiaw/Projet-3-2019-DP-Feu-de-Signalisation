package Signal;

import java.awt.Graphics;
import javax.swing.JLabel;

/**
*
* @author IBRAHIMA IBNU OMAR
*/

public abstract class AbstractSignal extends JLabel{
	
	/**
	 * function of this abstract class
	 */
	private static final long serialVersionUID = 1L;

	public abstract void paintComponent(Graphics g);
	
          
}
