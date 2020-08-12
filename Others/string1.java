class readTwoString{
	public static void main(String []ar){
		
		System.out.println("first String: "+ar[0]);
		System.out.println("Second String: "+ar[1]);
		
		if(ar[0].equals(ar[1])){
			System.out.println("The given strings are same");
		}
		else
			System.out.println("Strings are not same");
	}
}