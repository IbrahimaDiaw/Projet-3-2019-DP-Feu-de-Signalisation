/**
 * 
 */
package Signal_State;

import java.awt.Color;
import java.awt.Graphics;

import Signal.AbstractSignal;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class RedLight extends AbstractSignal{
	
	private Color color;
	public RedLight() {
    	this.color = color.RED;
    }
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.setColor(this.color);
		g.fillOval(967, 100, 100, 100);
		
	}


}
