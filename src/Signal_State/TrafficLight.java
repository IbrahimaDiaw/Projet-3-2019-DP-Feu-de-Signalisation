package Signal_State;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class TrafficLight extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GreenLight green;
	private YellowLight yellow;
	private RedLight red;
	private JLabel label;
	private Image img;

	private Color color;
	
	public TrafficLight() {
		this.green = new GreenLight();
		this.yellow = new YellowLight();
		this.red = new RedLight();
		this.label= new JLabel(new ImageIcon("images\\car1.png"));
		this.add(label);
		

	    t.start();
		repaint();
		
	}
	
	public void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		red.paintComponent(arg0);
		yellow.paintComponent(arg0);
		green.paintComponent(arg0);
		arg0.setColor(color.BLACK);
		arg0.drawRect(950,70,140,350);
	}
	int a =0;
	 int b=0;
	    Timer q = new Timer(10, new ActionListener(){

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            b++;
	           label.setLocation(b,250);
	           if(b==770){
	               b=0;
	           }
	           
	           
	        }
	        
	    });

  
     Timer t = new Timer(1000, new ActionListener(){
      
        @Override
        public void actionPerformed(ActionEvent e) {
           a++;
          
           switch(a){
               case 2:
                   red.setColor(color.RED);
                    yellow.setColor(color.BLACK);
                    green.setColor(color.BLACK);
                    q.stop();
                    repaint();
                   break;
               case 4:
            	   red.setColor(color.BLACK);
                   yellow.setColor(color.YELLOW);
                   green.setColor(color.BLACK);
                   q.start();
                   repaint();
                   
                   
                   break;
               case 6:
                   red.setColor(color.BLACK);
                   yellow.setColor(color.BLACK);
                   green.setColor(color.GREEN);
                   q.start();
                   repaint();
                   break;
           }
           if(a==6){
             a = 0;
           }
            
        }
      
        
    });
    
    
    
}
