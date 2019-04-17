package Signal_State;

import java.awt.Color;
import java.awt.Graphics;

import Signal.AbstractSignal;

/**
*
* @author IBRAHIMA IBNU OMAR
*/

public class GreenLight extends AbstractSignal{	
	private Color color;
	
	    public GreenLight() {
	    	this.color = color.black;
	    }
	@Override
	public void paintComponent(Graphics feu) {
		// TODO Auto-generated method stub
		
			feu.setColor(this.color);
			feu.fillOval(967, 300, 100, 100);
				
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

}
