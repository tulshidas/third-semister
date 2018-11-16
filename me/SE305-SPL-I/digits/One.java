package digits;

/*
        Draw Oval & Circle in Applet Window Example
        This java example shows how to draw ovals & circles in an applet window using
        drawOval method of Graphics class. It also shows how to draw a filled
        ovals and circles using fillOval method of Graphics class.
*/
 
/*
<applet code="DrawOvalsExample" width=500 height=500>
</applet>
*/
 
 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class One extends Applet{
 
	private static final long serialVersionUID = 1L;

		public void paint(Graphics g){
			
         
                setForeground(Color.red);
               
        		g.fillOval(100, 50, 8, 8);
        		g.fillOval(110, 40, 8, 8);
        		for(int i= 30;i<=90;i=i+10){
            		g.fillOval(120, i, 8, 8);

        		}
        		g.fillOval(110, 90, 8, 8);
        		g.fillOval(130, 90, 8, 8);

        }
}