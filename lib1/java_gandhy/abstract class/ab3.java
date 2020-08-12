//partially implementation of the abstract methods
abstract class first
{
	abstract void disp1();
	abstract void disp2();
}
abstract class sec extends first
{
	void disp1()
	{
		System.out.println("disp1");
	}
}
class third extends sec{
	void disp2()
	{
		System.out.println("dis2");
	}	
}
class ss
{
	public static void main(String ar[])
	{
		first z;
		z = new third();
		z.disp1();
		z.disp2();
	}
}