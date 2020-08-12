import java.awt.*;
import java.awt.event.*;
class choice_1 implements ItemListener
{
	Frame f;
	Choice c1,c2;
	int i;
	String a[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
	String b[]={"1","2","3","4","5","6","7","8","9","10"};
	choice_1()
	{
		c1=new Choice();
		c2=new Choice();
		f=new Frame();
		f.setSize(300,300);
		for(int i=0;i<a.length;i++)
			c1.add(a[i]);
		for(int i=0;i<b.length;i++)
			c2.add(b[i]);
		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(c2);
		f.setVisible(true);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Choice temp=(Choice)ie.getSource();
		if(temp==c1)
			c2.select(c1.getSelectedIndex());
		else if(temp==c2)
			c1.select(c2.getSelectedIndex());
	}
	public static void main(String []a)
	{
		choice_1 c=new choice_1();
	}
}