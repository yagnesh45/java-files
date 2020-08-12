//abstract class : having abstract and non-abstract method
abstract class first
{
	abstract void disp();
	void show()
	{
		System.out.println("Show method");
	}
}
class sec extends first
{
	void disp()
	{
		System.out.println("disp method");
	}
}
class ss
{
	public static void main(String ar[])
	{
		first z;
		z = new sec();
		z.disp();
		z.show();
	}	
}

