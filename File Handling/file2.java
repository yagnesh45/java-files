import java.io.*;
import java.util.Scanner;
class file2
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\file2.java");
		if(!f.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		try
		{			
			FileInputStream fis=new FileInputStream(f);
			int a;
			a=fis.read();
			while(a!=0)
			{
				System.out.print((char)a);
				a=fis.read();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}