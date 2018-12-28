import java.applet.*;
import java.awt.*;

public class DrawRect extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.drawRect(50,50,200,100);
		g.fillRect(50,50,200,100);

	}
}