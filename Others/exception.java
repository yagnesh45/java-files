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