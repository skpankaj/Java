/**
 * Object Oriented Programming: Chapter 22 - Writing Applets for Internet
 * Authors: Mudit Khetan & Navneet Verma
 ****************************************************************
 * First Applet - HelloWorld.
 **/

/*
 <APPLET Code = 'fourty3.class' Height = 200 width = 200>
 </APPLET>
*/


import javax.swing.JApplet;
import java.awt.Graphics;

public class fourty3 extends JApplet {
    public void paint(Graphics g)
     {
	g.drawRect(50, 50, getSize().width - 1, getSize().height - 1);
       g.drawString("Hello world!", 5, 15);
    }
}