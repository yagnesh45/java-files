import java.io.*;
import java.net.*;
import java.util.*;
class client2
{
	public static void main(String []ar) throws Exception
	{
		Socket s=new Socket("127.0.0.1",1060);
		System.out.println("Connection done!");
		Scanner sc=new Scanner(System.in);
		String msg=receive_message.receive(s);
		System.out.println(msg);
		String name1=sc.next();
		send_message.send(s,name1);
		String msg1="";
		String name="";
		do{
			msg1=receive_message.receive(s);
			System.out.println("Server Message:"+msg1);
			
			System.out.println("Enter your message:");
			name=sc.nextLine();
			send_message.send(s,name);
		}while(!name.equals("stop") && !msg1.equals("stop"));
		s.close();
	}
}