//Summer 2015: -

// Que.2 (C) - 1:


class demo{		//demo class created
	int a=5;
	int b=10;
	
	void display(){
		System.out.println("Value of a and b:"+a+"   "+b);
	}
}

class main{
	public static void main(String []ar){
		demo d=new demo();		//object of demo class created
		
		d.display();
	}
}		


// Que.2 (C) - 2:
// Ana mate javac pacchi je java no command ave ne ema java commandLine lakhya pachhi 3 city na nam lakhvana.


class commandLine{
	public static void main(String args[]){
		System.out.println("city names are:");
		if(args.length==3){
			for(int i=0;i<3;i++){
				System.out.println("city "+ i+1 +"=" +args[i]);
			}			
		}
	}
}	


// Que.2 (D) - 2


class TryCatch
{
	public static void main(String []r)
	{
		try{
			int i=0;
			int j=14/i;
		}
		catch(Arithm]eticException ae){
			System.out.println("Divide by Zero Error");
		}
	}
}	


// Que.3 (C) - 1

class methodOverloading{
	void display()
	{
		System.out.println("Method without arguments");
	}
	
	void display(int i)
	{
		System.out.println("Method having 1 argument");
		System.out.println("i="+i);
	}
}

class main{
	public static void main(String []ar){
		methodOverloading mo=new methodOverloading();
		
		mo.display();
		mo.display(20);
	}
}

// Que.3 (C) - 2

class Superclass{
	void display(){
		System.out.println("Method display from super class");
	}
}

class Subclass extends Superclass{
	void display(){
		System.out.println("Method display from sub class");
	}
}

class methodOverriding{
	public static void main(String []ar){
		Subclass s=new Subclass();
		
		s.display();		// sub class ni display method call thase.
	}
}

// Que.4 (A) - 1

import java.util.Scanner;
class leap
{
	int year=0;
	void get(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=sc.nextInt();
	}
}
class Year extends leap{
	boolean check(){
		if(year%4==0)
			return true;
		else
			return false;
	}
}
class demo{
	public static void main(String a[])
	{
		Year y=new Year();
		y.get();
		boolean b;
		b=y.check();
		if(b)
			System.out.println("entered year is leap year");
		else
			System.out.println("entered year is not leap year");
			
	}
}

// Que.4 (A) - 2

class userdefinedexception extends Exception{
	userdefinedexception(){
	// kai nai rakhe to pan chalse.	
	}
	
	public String toString()
	{
		return("Divide by Zero error       \n \t this is user defined exception");
	}
} 

class main{
	public static void main(String []ar) throws Exception
	{
		int a=10-10;
		int b=30;
		int answer;
		
		if(a==0)
		{
			throw new userdefinedexception();
		}
		else{
			answer=b/a;
			System.out.println("answer of divide is:"+answer);
		}
	}
}

// Que.4 (C) 

public class Mythread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            if(i%2 == 1)
                System.out.println("Odd Thread: "+i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            if(i%2 == 0)
                System.out.println("Even Thread: "+i);
        }
    }
}

// Que.5 (C)

interface demo{
	public void display()		//this method must be override in this interface's subclass in which it will be implemented.
	{
		//ama kai nai lakhe to chalse.
	}
}

class interfacedemo implements demo{
	void display(){
		System.out.println("method display from the sub class of the interface");
	}
}

class main{
	public static void main(String []ar){
		interfacedemo i=new interfacedemo();
		
		i.display();
	}
}

// Que.5 (D) nai avadto  

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Winter 2014 :-

//Que.3 (A) - 1

class sort{
	public static void main(String []ar) throws Exception{
		int a[]=new int[]{10,9,4,26,1};
		int temp=0;
	
   		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
}

// Que.3 (A) - 2

class readTwoString{
	public static void main(String []ar){
		
		System.out.println("first String: "+ar[0]);
		System.out.println("Second String: "+ar[1]);
		
		if(ar[0].equals(ar[1])){
			System.out.println("The given strings are same");
		}
		else
			System.out.println("Strings are not same");
	}
}

// Que.3 (B) banne question uper avi gaya chhe ek vaar joi leje.

// Que.4 (A) - 1

class calculateArea{
	float pi=3.14;
	float area=0.0;
	calculateArea(int r)
	{
		area=pi*r*r;
	}
	
	void display()
	{
		System.out.println("Area of circle is: "+area`);
	}
}
class main{
	public static void main(String []ar){
		calculateArea c=new calculateArea(20);
		
		c.display();
	}
}

// Que.4 (A) - 2

class Fibonacci{
	static int n1=0,n2=1,n3=0;
	static void fibonacci(int count){
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
		}
	}
	public static void main(String args[]){
		int count=5;
		System.out.print(n1+" "+n2);
		fibonacci(count-2);
	}
}

// Que.4 (B) - 1

import java.io.FileReader;
import java.io.IOException;

public class TextFileReadingExample1 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Que.4 (B) - 2

 
import java.io.FileWriter;
import java.io.IOException;
 

public class TextFileWritingExample1 {
	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------