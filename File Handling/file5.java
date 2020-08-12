import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class file5
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\1.txt");
		File f1=new File("E:\\java\\File Handling\\2.txt");
		if(!f.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		if(!f1.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{	
			Scanner sc=new Scanner(System.in);
			fis=new FileInputStream(f);
			fos=new FileOutputStream(f1);
			int a,Count;
			int temp=(int)f.length();
			System.out.println("enter the size:");
			Count=sc.nextInt();
			byte[] buffer=new byte[1024];
			while((a=fis.read(buffer))>0)
			{
				fos.write(buffer,Count,temp);
				Count++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}