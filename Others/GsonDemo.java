import com.google.gson.Gson;

class GsonDemo{
	public static void main(String []ar){
		/*emp e[]=new emp[3];
		for(int i=0;i<e.length;i++){
			e[i]=new emp();
		}
		
		e[0].set(27,20000,"employee1");
		e[1].set(25,20004,"employee2");
		e[2].set(26,20003,"employee3");*/
		
		std s=new std();
		int p[]={10,20,30};
		s.set(p,"aaa");
		Gson g=new Gson();
		
		String json=g.toJson(s);		
		System.out.println(json);
		
		s=g.fromJson(json,std.class);
		
		s.display();
	}
}

class std{
 String name;
	int []marks;
	
	void set(int a[],String n){
		marks=a;
		name=n;
	}
	
	void display(){
		System.out.println("Name:"+name);
		for(int x:marks){
			System.out.println(x);
		}
	}
}