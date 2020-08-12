interface demo1
{
	void disp1();
	void disp2();
}
abstract class demo2 implements demo1{
	public void disp1()
	{
		System.out.println("1");
	}
}
class demo3 extends demo2
{
	public void disp2()
	{
		System.out.println("2");
	}	
}