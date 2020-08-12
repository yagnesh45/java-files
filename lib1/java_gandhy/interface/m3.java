class demo1
{
	demo1()
	{
		System.out.println("1");
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
}
class ss
{
	public static void main(String ar[])
	{
		demo3 z = new demo3();
	}
}