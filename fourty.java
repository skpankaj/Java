//wap to java applet for drawing and filling the polygon// 
/* 
<html>
<Applet code="fourty" Height=500 Width=500 >
</Applet>
</html>
*/

import java.awt.*;
import java.applet.*;

public class fourty extends Applet 
{
    public void paint(Graphics g) 
    {
	 
       g.drawRect(120,120,120,180) ;
       g.setColor(Color.pink);
       setBackground(Color.blue);
       int[]xpoints={100,350,150};
       int[]ypoints={200,100,50};
       Polygon mytriangle=new Polygon(xpoints,ypoints,3);
       g.drawPolygon(mytriangle);
       xpoints=new int[]{250,400,300};
       ypoints=new int[]{250,250,120};
       mytriangle=new Polygon (xpoints, ypoints, 3);
       g.fillPolygon(mytriangle);
   }
 }
       
