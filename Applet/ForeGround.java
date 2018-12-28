import java.applet.*;
import java.awt.*;

public class ForeGround extends Applet{
	public void paint(Graphics g){
		g.drawString("HelloWorld",25,25);
		g.setForeground(Color.red);
	}
}