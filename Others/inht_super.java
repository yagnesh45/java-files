class first
{
	void disp()
	{
		System.out.println("First");
	}
}

class sec extends first
{
	void disp()
	{
		// super.disp();  This --
		 OR  --
	}						//			 |
	void show()				//			 |
	{						//			 |		
		super.disp();		//<-- This --	
	}
}

class third extends sec
{
	void disp()
	{
		System.out.println("Third");
	}
}

class superkeyword
{
	public static void main(String arg[])
	{
		third t=new third();
		t.disp();
	}
}