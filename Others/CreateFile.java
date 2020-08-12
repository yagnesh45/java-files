import java.io.*;
class CreateFile{
	public static void main(String []ar) throws IOException,SecurityException{
		File f=new File("2.txt");
		f.delete();
		boolean b=f.createNewFile();
		
		System.out.println(b);
		b=f.createNewFile();
		f.delete();
		
		System.out.println(b);
	}
}