import java.io.*;
import java.util.Scanner;
class f5 {
		
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int size;
		String path;

		System.out.println("Enter Size ");
		size=sc.nextInt();							//size in KB
		
		System.out.println("Enter Location of file to be split ");
		path=sc.next();								//path of file
		
		try{
		File f=new File(path);						//Connecting File Object with File
		
		FileInputStream fis=new FileInputStream(f);	//Connecting FileInputStream with File
		
		if(!f.exists()){												//Checking availability of file
			System.out.println("File Doesnt Exist");
			return;
		}
		
		if((f.length()/1024) <size){								//If entered size is greater than size of file
			System.out.println("Please Enter appropriate size");
			return;
		}
		
		System.out.println("Enter Name of first file");
		path=sc.next();												
		File f1=new File(path);

		System.out.println("Enter Name of second file");
		path=sc.next();
		File f2=new File(path);
		
		FileOutputStream fos=new FileOutputStream(f1);
		FileOutputStream fos1=new FileOutputStream(f2);
		
			f1.createNewFile();
		
			while((f1.length()/1024)!=size){
				fos.write((char)fis.read());
			}
			
			f2.createNewFile();
			
			int a=fis.read();
			
			while(a!=-1){
				fos1.write((char)a);
				a=fis.read();
			}
		}catch(Exception e){e.printStackTrace();}
	}
}