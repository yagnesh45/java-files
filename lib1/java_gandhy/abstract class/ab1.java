//abstract class : having abstract method
abstract class first
{
	abstract void disp();
}
class sec extends first
{
	void disp()
	{
		System.out.println("hi");
	}
}
class ss
{
	public static void main(String ar[])
	{
		first z;
		//z = new first();	no allowed
		z = new sec();
		z.disp();
	}
}