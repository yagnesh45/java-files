class sort{
	public static void main(String []ar) throws Exception{
		int a[]=new int[]{10,9,4,26,1};
		int temp=0;
	
   		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
}