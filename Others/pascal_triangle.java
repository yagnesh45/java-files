import java.util.Scanner;
class pascal_triangle
{
	public static void main(String arg[])
	{
		int a[][],i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number Of Rows:");
		n=sc.nextInt();
		a=new int[n][];
		for(i=0;i<n;i++)
		{
			a[i]=new int[i+1];
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][0]=1;
				a[i][a[i].length-1]=1;
				if(i>1 && j>0 && j<a[i].length-1)
				{
					a[i][j]=a[i-1][j-1] + a[i-1][j];
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}		
	}
}
