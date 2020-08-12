class demo1
{
	void disp()
	{
		System.out.println("disp1");
	}
}
interface demo2
{
	void disp();
}
class demo3 extends demo1 implements demo2
{
	public void disp()
	{
		System.out.println("3");
	}
}
class ss
{
	public static void main(String ar[])
	{
		//demo3 z = new demo3();
		//z.disp();
	}
}