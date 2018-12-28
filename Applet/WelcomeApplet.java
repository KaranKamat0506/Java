import java.applet.*;
import java.awt.*;

public class WelcomeApplet extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		setBackground(Color.blue);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Welcome to java Applets",70,70);
	}
}