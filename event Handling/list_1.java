import java.awt.*;
import java.awt.event.*;
class list_1 implements ItemListener
{
	Frame f;
	List c1,c2;
	int i;
	Button b1,b2;
	Panel p;
	String a[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
	list_1()
	{
		c1=new List();
		c2=new List();
		p=new Panel();
		b1=new Button(">>");
		b2=new Button("<<");
		f=new Frame();
		f.setSize(300,300);
		for(int i=0;i<a.length;i++)
			c1.add(a[i]);
		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(p);
		p.setLayout(new GridLayout(2,1));
		f.add(c2);
		p.add(b1);
		p.add(b2);
		f.setVisible(true);
		c1.addItemListener(this);
		c2.addItemListener(this);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(c1.getSelectedItem()!=null)
				{
					c2.add(c1.getSelectedItem());
					c1.remove(c1.getSelectedItem());
				}
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(c2.getSelectedItem()!=null)
				{
					c1.add(c2.getSelectedItem());
					c2.remove(c2.getSelectedItem());
				}
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		System.out.println("c1:"+c1.getSelectedItem());
		System.out.println("c2:"+c2.getSelectedItem());
	}
	public static void main(String []a)
	{
		list_1 c=new list_1();
	}
}