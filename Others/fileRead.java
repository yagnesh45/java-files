import java.io.*;
class fileRead{
	public static void main(String []ae) throws Exception{
		int i;
		FileInputStream fin=new FileInputStream("1.txt");
		i=fin.read();
		while(i != -1){
			System.out.print((char)i);	
			i=fin.read();
		}
	}
}