class demo1
{
	demo1()
	{
		System.out.println("1");
	}
	void disp()
	{
		System.out.println("disp1");
	}
}
interface demo2
{}
class demo3 extends demo1 implements demo2
{
	demo3()
	{
		super();
		System.out.println("3");	
	}
	void disp()
	{
		System.out.println("disp3");
		super.disp();
	}
}
class ss
{
	public static void main(String ar[])
	{
		demo3 z = new demo3();
		z.disp();
	}
}