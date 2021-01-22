/**
 * Object Oriented Programming: Chapter 22 - Writing Applets for Internet
 * Authors: Mudit Khetan & Navneet Verma
 ****************************************************************
 * Drawing co-centric circles.
 **/

/*
 <APPLET Code = 'CocentricCircles.class' Height = 500 width = 500>
 </APPLET>
*/
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.Graphics;

public class fourty2 extends JApplet {
	public void paint(Graphics g)
	 {
		int i=1;
		do {
			g.drawOval(110-i*10,110-i*10,i*20,i*20);
			i++;
		}while(i<=10);

  		 g.drawRect(240,240,360,360) ;
                 g.setColor(Color.green);
		 setBackground(Color.blue);
		  
	}
}