import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class mouse3 extends Applet implements MouseListener
{
	Label t;
	GridLayout gd;
	int x,y;
	public mouse3()
	{
		t=new Label();
		gd=new GridLayout(2,1);
		addMouseListener(this);
		//setLayout(gd);
		//add(t);
		
	}
	
		
	
	public void mouseClicked(MouseEvent me)
	{
		System.out.println(me.getX());
		System.out.println(me.getY());
		x=me.getX();
		y=me.getY();
		
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		//setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent me)
	{
		//setBackground(Color.BLUE);
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{

	}
	
	
	public void paint(Graphics g)
	{
		g.drawOval(x,y,50,50);
	}
}	
/* <applet code="mouse3" height="500" width="500">
</applet>*/		