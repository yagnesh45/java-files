import java.util.Scanner;
class array1
{
	public static void main(String x[])
	{
		int a[],i;
		a=new int[5];
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter array values");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Entered value:"+a[i]);
		}
	}
}