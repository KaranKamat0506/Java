import java.awt.*;
import java.applet.*;
public class applet15 extends Applet{
	public void paint(Graphics g){
		g.drawLine(10,10,50,50);
		g.drawRect(10,60,40,30);
		g.setColor(Color.blue);
		g.fillRect(60,10,30,80);
		g.drawOval(230,10,200,150);
		g.setColor(Color.red);
		g.fillOval(245,25,100,100);
	}
}
