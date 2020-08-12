import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class event12 extends Applet
{
	Choice c;
	String s[]={"one","two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	//GridLayout gd;
	
	public event12()
	{
		c=new Choice();
		for(int i=0;i<10;i++)
		{
			c.add(s[i]);
		}
		
		add(c);
	}
}	
		
/*<applet code="event12" height="500" width="500">
</applet>*/	
		
		
		