class choice_1
{
	Frame f;
	Choice c1;
	Char a[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
	choice_1()
	{
		c1=new Choice();
		f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		for(int i=0;i<a.length;i++)
			c1.add(a[i]);
		f.setLayout(new FlowLayout());
		f.add(c1);
	}
	public static void main(String []a)
	{
		choice_1 c=new choice_1();
	}
}