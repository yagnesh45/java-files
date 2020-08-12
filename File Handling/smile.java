import java.awt.*;
import java.applet.Applet;
public class smile extends Applet
{
	public void paint(Graphics g)
	{
		int a[]={190,240,380,260};
		int b[]={240,450,460};
		g.drawOval(45,60,150,150);
		g.setColor(Color.YELLOW);
		g.fillOval(45,60,150,150);
		g.setColor(Color.BLACK);
		g.drawOval(80,80,25,37);
		g.fillOval(80,80,25,37);
		g.drawOval(130,80,25,37);
		g.fillOval(130,80,25,37);
		g.drawArc(70,70,100,120,200,138);
	}
}

/*
<applet code=smile height=500 width=500>
</applet>*/