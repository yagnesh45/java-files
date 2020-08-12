import java.net.*;
import java.util.*;
class server2{
	public static void main(String []ar) throws Exception
	{
		ServerSocket s=new ServerSocket(1060);
		System.out.println("Waiting for Connection!");
		Socket ss;
		ss=s.accept();
		Scanner sc=new Scanner(System.in);
		send_message.send(ss,"Enter your name:");
		String msg=receive_message.receive(ss);
		System.out.println(msg);
		String m="",msg1="";
		do{
			System.out.println("Enter the message:");
			m=sc.nextLine();
			send_message.send(ss,m);
			msg1=receive_message.receive(ss);
			System.out.println("Client Message:"+msg1);
			
		}while((!m.equals("stop") && !msg1.equals("stop")) || (!m.equals("bye") && !msg1.equals("bye")));
		
		ss.close();
	}
}