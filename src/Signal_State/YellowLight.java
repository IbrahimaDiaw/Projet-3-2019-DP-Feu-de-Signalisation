package Signal_State;

import Signal.AbstractSignal;

import java.awt.Color;
import java.awt.Graphics;



public class YellowLight extends AbstractSignal{
    private Color color;
    public YellowLight() {
    	this.color = color.black;
    }
  
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.fillOval(967, 200, 100, 100);
		
		
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
