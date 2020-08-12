class Area_Rectangle{
	int len,br,hei;
	Area_Rectangle(int l,int b,int h){
		len=l;
		br=b;
		hei=h;
	}
	
	Area_Rectangle(Area_Rectangle a){
		len=a.len;
		br=a.br;
		hei=a.hei;
	}
	
	int findArea(){
		int area=len*br*hei;
		return area;
	}
}

class main{
	public static void main(String a[]){
		Area_Rectangle a1=new Area_Rectangle(10,20,30);
		
		Area_Rectangle a2=new Area_Rectangle(a1);
		
		int answer=a2.findArea();
		
		System.out.println("Area of Rectangle is:"+answer);
	}
}