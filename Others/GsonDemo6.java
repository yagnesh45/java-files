import com.google.gson.Gson;

class student1{
	String name;
	//int marks;
	
	/*void set(String n,int m){
		name=n;
		marks=m;
	}*/
	
	void display(){
		System.out.println("Name: "+name);
	}
}

class student2 extends student1{
	String name;
	
	void set2(String n,String s,int no){
		name=n;
		//enNo=no;
		super.name=s;
	}
	
	void display2(){
		System.out.println("Name from sub class:"+name);
		//System.out.println("Age:"+age+" enNo:"+enNo);
	}
}

class GsonDemo6{
	public static void main(String []ar){
		student2 s2=new student2();
		s2.set2("yagnesh","super",20);
		//s2.set2(18,45);
		
		Gson g=new Gson();
		String s=g.toJson(s2);
		
		System.out.println("JSON-->:"+s);
		s2=g.fromJson(s,student2.class);
		
		s2.display();
		s2.display2();
	}
}
