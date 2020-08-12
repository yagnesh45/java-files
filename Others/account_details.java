import java.util.Scanner;
class account_details{
	String name;
	long Account_number;
	String type_of_acc;
	int balance;
	
	account_details(String n,long accNo,String type,int bal){
		name=n;
		Account_number=accNo;
		type_of_acc=type;
		balance=bal;
	}
	
	void deposit(){
		System.out.println("Enter the ammount to deposit:");
		Scanner sc=new Scanner(System.in);
		
		int amount=sc.nextInt();
		if(balance>1000)
			balance=balance+amount;
		else
			System.out.println("minimum balance should be 1000");
	}
	
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Balance in your account:"+balance);
		System.out.println();
	}
}

class main{
	public static void main(String []ar){
		account_details a1=new account_details("yagnesh",123456789,"Saving",2000);
		
		a1.deposit();		
		a1.display();
		
		account_details a2=new account_details("yagnesh2",1234567810,"FD",900);
		
		a2.deposit();
		a2.display();
	}
}