class object_pass{
	int a,b;
	object_pass(int x,int y){
		a=x;
		b=y;
	}
	
	void display(object_pass o){
		System.out.println("value of variables of the passed object to this display function:-");
		System.out.println("a="+o.a);
		System.out.println("b="+o.b);
	}

}

class main{
	public static void main(String a[]){
		object_pass o1=new object_pass(20,30);	
		object_pass o2=new object_pass(10,20);	
		
		o1.display(o2);    //passing object as an argument
	}
}