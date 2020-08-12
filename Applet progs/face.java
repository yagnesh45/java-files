import java.applet.Applet;

public class face extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(100,100,300,300); //face
		g.drawOval(150,150,70,70);  //eye1
		g.drawOval(280,150,70,70);	//eye2
		g.drawLine(250,230,250,290);	//nose
		g.drawArc(185,270,130,60,0,-180);
		//g.drawLine(250,270,300,250);
		/*g.drawOval(100,100,300,300);*/
	}
}
		
	