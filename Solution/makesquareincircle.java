import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class  makesquareincircle extends Applet {

 public void paint(Graphics g) {
  
  g.setColor(Color.DARK_GRAY);
  g.fillRect(50,50,200,200);
  g.setColor(Color.BLUE);
  g.fillOval(90, 120, 70, 70);
  
 }
}


