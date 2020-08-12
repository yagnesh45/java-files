import java.io.*;
class BufferRead{
	public static void main(String []ar) throws IOException{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the characters, q to exit");
		
		do{
			c=(char)br.read();
			System.out.println(c);
		}while(c!='q');
	}
}