/*>WAP in java bean to add a button to the bean and display the number of times the button has 
 been clicked.
 */
 
import java.awt.*;
import java.awt.event.*;

public class button extends Panel implements ActionListener
{
	int count;
	Button b;
	
	public button()
	{
		count=0;
		setSize(200,200);
		b=new Button("CLICK ME");
		b.addActionListener(this);
		add(b);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		count++;
		repaint();
		
	}
	public void paint(Graphics g)
	{
		Dimension d=getSize();
		int h=d.height;
		int w=d.width;
		
		g.setColor(Color.pink);
		
		g.fillRect(0,0,w,h);
		g.setColor(new Color(0,0,0));
		g.drawString("CLICK COUNT "+count,50,50);
		
		
	}
	
}      