import com.google.gson.Gson;
class GsonDemo8{
	String name;
	int age;
	InnerOne i;
	void display(){
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		i.displaySal();
	}
	
	void set(String n,int a,InnerOne i){
		name=n;
		age=a;
		this.i = i;
	}
	
	class InnerOne{
		int salary;
		//GsonDemo8 g1;
		void setSalary(int s/*,GsonDemo8 g*/){
			salary=s;
			//g1=g;
		}
		void displaySal(){
			//g1.display();
			System.out.println("Salary:"+salary);
		}
	}
}

class demo{
	public static void main(String []ae){
		GsonDemo8 g=new GsonDemo8();
		GsonDemo8.InnerOne i = g.new InnerOne();
		i.setSalary(5000);
		g.set("Yagnesh",19,i);
		Gson g2=new Gson();
		String json=g2.toJson(g,GsonDemo8.class);
		
		System.out.println(json);
	}
}