interface super1{
	public static final int a=10;
	public void display1();
}

interface super2{
	public static final int b=30;
	public void display2();
}

class subclass implements super1,super2{
	int c;
	public void display1(){
		System.out.println("overridden method for super1 interface");
	}
	public void display2(){
		System.out.println("Overridden method for super2 interface");
	}
	void display3(){
		System.out.println("Method from sub class");
		c=super1.a+super2.b;
		System.out.println("Sum of the a and b from two super interfaces :"+c);
	}
}

class main{
	public static void main(String a[]){
		subclass s=new subclass();
		s.display1();
		s.display2();
		s.display3();
	}
}