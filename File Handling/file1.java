import java.io.*;
import java.util.Scanner;
class file1
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\file1.java");
		if(!f.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		
		try{
			
		FileInputStream fis=new FileInputStream(f.getPath());
		String a;
		Scanner sc;
		sc=new Scanner(f);
		a=sc.nextLine();
		while(sc.hasNext())
		{
			System.out.println(a);
			a=sc.nextLine();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}