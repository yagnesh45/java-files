class read5numbers{
	public static void main(String[] ar){
		int sum=0;
		char a[][]=ar.toCharArray();
		for(int i=0;i<5;i++){
			for(int j=0;j<a[j].length;j++){
				sum=(char)(sum+a[i][j]);
			}
		}
		int avg=sum/5;
		
		System.out.println("sum="+sum);
		System.out.println("Average="+avg);
	}
}