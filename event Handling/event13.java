import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class event13 extends Applet implements ItemListener
{
	Choice c1,c2;
	String s1[]={"one","two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	String s2[]={"1","2","3","4","5","6","7","8","9","10"};
	//GridLayout gd;
	
	public event13()
	{
		c1=new Choice();
		c2=new Choice();
		for(int i=0;i<10;i++)
		{
			c1.add(s1[i]);
			c2.add(s2[i]);
		}
		
		add(c1);
		add(c2);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		Choice c=(Choice) ie.getSource();
		if(c==c1)
		{
			c2.select(c1.getSelectedIndex());	
		}

		else if(c==c2)
		{
			c1.select(c2.getSelectedIndex());	
		}
	}
	//public void getSelectedIndex()
}	
		
/*<applet code="event13" height="500" width="500">
</applet>*/	
		
		
		