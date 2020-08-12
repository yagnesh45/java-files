import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener
{
	Label t;
	GridLayout gd;
	public mouse()
	{
		t=new Label();
		gd=new GridLayout(2,1);
		addMouseListener(this);
		setLayout(gd);
		add(t);
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
		t.setText("Clicked");
	}
	public void mouseEntered(MouseEvent me)
	{
		t.setText("Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		t.setText("Exited");
	}
	public void mousePressed(MouseEvent me)
	{
		t.setText("Pressed");
	}
	public void mouseReleased(MouseEvent me)
	{
		t.setText("Releasd");
	}
	
}	
/* <applet code="mouse" height="500" width="500">
</applet>*/		