import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvents" width=300 height=100></applet>
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
 {
String msg="" ;
int X,Y ;

public void init() 
{
addMouseListener(this);
addMouseMotionListener(this);
}



public void mouseClicked(MouseEvent me)
 {

X = me.getX();
Y = me.getY();
setBackground(Color.red);
msg = "Mouse clicked.";
repaint();
}



public void mouseEntered(MouseEvent me)
 {

}

public void mouseExited(MouseEvent me)
 {
X = me.getX();
Y = me.getY();
setBackground(Color.black);
msg = "Mouse exited.";
repaint();
}

public void mousePressed(MouseEvent me)
 {
X = me.getX();
Y = me.getY();
setBackground(Color.yellow);
msg="MOUSE PRESSED";
repaint();
}

public void mouseReleased(MouseEvent me) {
X = me.getX();
Y = me.getY();
setBackground(Color.cyan);
msg="MOUSE RELEASED";
repaint();
}

public void mouseDragged(MouseEvent me) {
X = me.getX();
Y = me.getY();
msg = "mouse dragged";
repaint();
}
public void mouseMoved(MouseEvent me)
 {
X = me.getX();
Y = me.getY();
setBackground(Color.green);
msg = "GAUTHAM";
repaint();
}

public void paint(Graphics g)
 {
g.drawString(msg, X,Y);
}
}
