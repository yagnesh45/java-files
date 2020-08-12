package lib1.lib2;
import lib1.*;

public class inner
{
	outer o=new outer();
	
	public void disp()
	{
		o.disp();
		System.out.println("This is from inner");
	}
}