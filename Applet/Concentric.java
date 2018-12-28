import java.applet.*;
import java.awt.*;

public class Concentric extends Applet{
	public void paint(Graphics g){
		g.drawOval(100,100,50,50);
		g.drawOval(100,100,75,75);
		g.drawOval(100,100,90,90);
	}
}