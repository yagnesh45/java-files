//abstract class without any abstract method
abstract class first
{
	void disp()
	{
		System.out.println("disp1");
	}
}
class sec extends first{
	void show()
	{
		System.out.println("show method");
	}
}
class ss
{
	public static void main(String ar[])
	{
		 first z;
		 //z = new first(); error
		 z = new sec();
		 z.disp();
	}
}