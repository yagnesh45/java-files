interface p1{
	public static final int pi1=200;
	public void display1();
}

interface p2{
	public static final int pi2=100;
	public void display2();
}

interface p12 extends p1,p2{
	public static final int pi12=300;
	public void display1();
	public void display2();
	public void display12();
}

class Q implements p12{
	public void display1(){
		System.out.println("overridden display for interface p1");
		System.out.println("value of variable of interface p1:"+p1.pi1);
	}
	public void display2(){
		System.out.println("overridden display for interface p2");
		System.out.println("value of variable of interface p2:"+p2.pi2);
	}
	public void display12(){
		System.out.println("overridden display for interface p12");
		System.out.println("value of variable of interface p12:"+p12.pi12);
	}
	void displayQ(){
		System.out.println("display method for the class Q");
	}
}

class main{
	public static void main(String ap[]){
		Q q=new Q();
		q.display1();
		q.display2();
		q.display12();
		q.displayQ();
	}
}