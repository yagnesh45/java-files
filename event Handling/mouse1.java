import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class mouse1 extends Applet implements MouseListener
{
	Label t;
	GridLayout gd;
	public mouse1()
	{
		t=new Label();
		gd=new GridLayout(2,1);
		addMouseListener(this);
		//setLayout(gd);
		//add(t);
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.BLUE);
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{

	}
	
}	
/* <applet code="mouse1" height="500" width="500">
</applet>*/		