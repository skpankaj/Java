//wap to java applet for basic shapes// 
/* 
<Applet code="thirtynine.class" Height=500 Width=500 >
</Applet>
*/

import java.awt.*;
import java.applet.*;

public class thirtynine extends Applet 
{
    public void paint(Graphics g)
    {
	 
       g.drawString("Hello world of java", 5, 15);
       g.drawRect(100,200,140,130);
       g.setColor(Color.green);
       g.drawLine(10,20,58,60);
       g.setColor(Color.pink);
       g.drawOval(130,240,80,80);
       g.drawArc(100,150,80,80,0,120);
        
    }
}
 
