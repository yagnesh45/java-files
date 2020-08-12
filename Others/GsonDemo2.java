import com.google.gson.Gson;

class GsonDemo2{
	public static void main(String []ar){
		int a1[]={100,200,300};
		Gson g=new Gson();
		
		String a=g.toJson(a1);
		
		System.out.println("to Json:"+a);
		
		g=new Gson();
		int p[]=g.fromJson(a,int[].class);
		
		for(int x:p)
			System.out.println("from json:"+x);
	}
}