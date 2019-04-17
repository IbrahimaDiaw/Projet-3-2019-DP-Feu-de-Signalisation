/**
 * 
 */
package Main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Signal_State.TrafficLight;



/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class TestStatePattern extends JFrame {
      
	 private TrafficLight panel;
	
	 public TestStatePattern() {
		 super("Traffic Simulation");
		 setVisible(true);
		 setSize(1125,750);
		 this.setLayout(new BorderLayout());
		 panel = new TrafficLight();
		 panel.setBackground(Color.LIGHT_GRAY);
		 this.add(panel, BorderLayout.CENTER);

	 }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Create and display the form */
		
		
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestStatePattern().setVisible(true);
            }
        });
	}

}
