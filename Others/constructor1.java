class demo1 
{	
	int b;
	demo1(int p) 
	{
		b=p;
		System.out.println("Super");
	}
	
	demo1()
	{
	}
}
class demo2 extends demo1
{
	
	demo2()
	{
		
		System.out.println("Sub");
	}
	void disp2()
	{
		System.out.println(b);
	}
}



class ss
{
	public static void main(String arg[])
	{
		demo2 z=new demo2();
		//z.disp2();
	}
}