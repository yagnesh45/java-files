//abstract class : having abstract method
//trying to access abstract method using super keyword
abstract class first
{
	abstract void disp();
}
class sec extends first
{
	void disp()
	{
		System.out.println("hi");
		super.disp();//Error
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