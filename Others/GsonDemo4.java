import com.google.gson.Gson;

class student{
	String name;
	int marks[];
	
	void set(String n,int m[]){
		name=n;
		marks=m;
	}
	
	void display(){
		System.out.println("Name: "+name+" marks:");
		for(int i:marks)System.out.println(" "+i);
	}
}

class GsonDemo4{
	public static void main(String []ar){
		student s[]=new student[3];
		for(int i=0;i<s.length;i++){
			s[i]=new student();
		}
		
		s[0].set("Std1",new int[]{10,20,30});
		s[1].set("Std2",new int[]{40,50,60});
		s[2].set("Std3",new int[]{70,80,90});
		
		Gson g=new Gson();
		String str=g.toJson(s);
		
		System.out.println(str);
		
		s=g.fromJson(str,student[].class);
		for(student t:s){
			t.display();
		}
	}
}