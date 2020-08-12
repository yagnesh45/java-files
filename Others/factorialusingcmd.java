class factorial{
	public static void main(String []ar){
		int ans=1;
		for(int i=1;i<Integer.parseInt(ar[0]);i++){
			ans=ans*i;
		}
		System.out.println("Answer ="+ans);
	}
}