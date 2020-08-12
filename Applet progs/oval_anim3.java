import java.applet.Applet;
import java.awt.Graphics;

public class oval_anim3 extends Applet implements Runnable
{
	int x=0,y=0,x1=400,y1=0,w=100,h=100;
	int ovals=1;
	
	public void init()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		if(ovals==1)	
		g.drawOval(x,y,w,h);

		else
		{
			g.drawOval(x,y,w,h);
			g.drawOval(x1,y1,w,h);
		}
	}	
	public void run()
	{
		int fx=0,fy=0,fx1=1,fy1=0;
		while(true)
		{
			if(ovals==1)
			{	
				if(fx==0 && fy==0)
				{
					x++;
				}
				else if(fx==1 && fy==0)
				{
					y++;
					ovals=2;
				}
				else if(fx==1 && fy==1)
				{
					x--;
				}
				else if(fx==0 && fy==1)
				{
					y--;
				}
		
				if(getWidth()==x+100)
				{
					fx=1;
				}
				if(getHeight()==y+101)
				{
					fy=1;
				}
				if(x==0)
				{
					fx=0;
				}
				if(y==0)
				{
					fy=0;
				}
			}
			
			else
			{
				if((fx==0 && fy==0) && (fx1==0 && fy1==0))
				{
					x++;
					x1++;
				}
				else if((fx==1 && fy==0) && (fx1==1 && fy1==0))
				{
					y++;
					x1--;
				}
				else if((fx==1 && fy==1) && (fx1==0 && fy1==0))
				{
					x--;
					x1++;
				}

				else if((fx==0 && fy==1) && (fx1==0 && fy1==0))
				{
					y--;
					x1--;
				}
		
				if(getWidth()==x+100)
				{ 
			
					fx=1;
				}
				if(getWidth()==fx1+100)
				{
					fx1=1;
				}
						
				if(getHeight()==y+99)
				{
					fy=1;
				}
				
				if(x==0)
				{
					fx=0;
				}
				if(x1==0)
				{
					fx1=0;
				}
				
				if(y==0)
				{
					fy=0;
				}	
			}	 
		
				
				
			try
			{
				//if(Thread.currentThread()==t)			
				
				Thread.sleep(5);
			}
			catch(Exception e){}
			repaint();
		}
	}
}  

/* <applet code="oval_anim3" height="500" width="500">
</applet>*/