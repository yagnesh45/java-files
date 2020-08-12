import com.google.gson.Gson;

class student1{
	String name;
	int marks;
	student2 s;
	
	void set(String n,int m){
		name=n;
		marks=m;
		s=new student2();
		s.set2(18,45);
	}
	
	void display(){
		System.out.println("Name: "+name+"marks:"+marks);
		s.display2();
	}
}

class student2{
	//String name;
	int age,enNo;
	
	void set2(int n,int no){
		age=n;
		enNo=no;
		//super.name=s;
	}
	
	void display2(){
		//System.out.println("Name from sub class:"+name);
		System.out.println("Age:"+age+" enNo:"+enNo);
	}
}

class GsonDemo7{
	public static void main(String []ar){
		student1 s=new student1();
		s.set("yagnesh",20);
		//s.set2(18,45);
		
		Gson g=new Gson();
		String s1=g.toJson(s);
		
		System.out.println("JSON-->:"+s1);
		s=g.fromJson(s1,student1.class);
		
		s.display();
		//s2.display2();
	}
}
