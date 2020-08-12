import java.awt.*;
import java.applet.Applet;
public class crown extends Applet implements Runnable
{
	Thread t;
	int a=0,b=90,c=180,d=270;
	
	Color rd=Color.RED;
	Color gr=Color.GREEN;
	Color bl=Color.BLUE;
	Color yl=Color.YELLOW;
	
	public crown()
	{
		t=new Thread(this);
		t.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(rd);
		g.fillArc(10,70,100,100,a,b);
		g.setColor(gr);
		g.fillArc(10,70,100,100,b,b);
		g.setColor(bl);
		g.fillArc(10,70,100,100,c,b);
		g.setColor(yl);
		g.fillArc(10,70,100,100,d,b);
		g.setColor(Color.BLACK);
		g.drawLine(58,169,58,230);
		g.drawLine(63,169,63,230);
		g.drawLine(17,230,110,230);
	}
	public void run(){
		while(true)
		{
			try{
				
				if(rd==Color.RED){
				rd=Color.GREEN;
				gr=Color.BLUE;
				bl=Color.YELLOW;
				yl=Color.RED;
				Thread.sleep(500);
				repaint();
				}
				if(rd==Color.GREEN){
				yl=Color.GREEN;
				rd=Color.BLUE;
				gr=Color.YELLOW;
				bl=Color.RED;
				Thread.sleep(500);
				repaint();
				}
				if(rd==Color.BLUE){
				yl=Color.BLUE;
				rd=Color.YELLOW;
				gr=Color.RED;
				bl=Color.GREEN;
				Thread.sleep(500);
				repaint();}
				if(rd==Color.YELLOW){
				yl=Color.YELLOW;
				rd=Color.RED;
				gr=Color.GREEN;
				bl=Color.BLUE;
				Thread.sleep(500);
				repaint();	}			
			}
			catch(Exception e){}
		}
	}
}

/*
<applet code=crown height=500 width=500>
</applet>
*/