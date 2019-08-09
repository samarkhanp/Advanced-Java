    
/*
<applet code="Key" width=300 height=400>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Graphics;


public class Key extends Applet
implements KeyListener
{
	int X=20,Y=30,x=200,y=200;
	String msg="KeyEvents--->";
Image a,b;
	public void init()
	{
		addKeyListener(this);
		requestFocus();
		
		
		b=getImage(getDocumentBase(),"roadg.gif");
		
		a=getImage(getDocumentBase(),"car2.png");
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyDown");
		int key=k.getKeyCode();
		switch(key) 
		{
			case KeyEvent.VK_UP:
				{showStatus("Move to Up");
					y=y-25;
				break;
				}
			case KeyEvent.VK_DOWN:
				showStatus("Move to Down"); y=y+25;
				break;
			case KeyEvent.VK_LEFT:
				showStatus("Move to Left"); x=x-25;
				break;
			case KeyEvent.VK_RIGHT:
				showStatus("Move to Right"); x=x+25;
				break;

		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent k)
	{
		msg+=k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
		
		g.drawImage(b,0,0,this);

		g.drawImage(a,x,y,this);
	}
}
