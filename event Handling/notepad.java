import java.awt.event.*;
import java.awt.*;
class notepad extends WindowAdapter implements ActionListener,ItemListener
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi[];
	CheckboxMenuItem c1;
	notepad()
	{
		f=new Frame();
		f.setTitle("Notepad");
		mb=new MenuBar();
		mi=new MenuItem[12];
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Format");
		mi[0]=new MenuItem("new");
		mi[1]=new MenuItem("save");
		mi[2]=new MenuItem("Open");
		mi[3]=new MenuItem("Exit");
		mi[4]=new MenuItem("undo");
		mi[5]=new MenuItem("Go to");
		mi[6]=new MenuItem("Copy");
		mi[7]=new MenuItem("Paste");
		c1=new CheckboxMenuItem("Wrap Text");
		mi[8]=new MenuItem("Set Font-size");
		mi[9]=new MenuItem("Set Font-color");
		mi[10]=new MenuItem("Preferences");
		f.setSize(500,500);
		f.setVisible(true);
		f.setMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		m1.add(mi[0]);
		m1.add(mi[1]);
		m1.add(mi[2]);
		m1.add(mi[3]);
		m2.add(mi[4]);
		m2.add(mi[5]);
		m2.add(mi[6]);
		m2.add(mi[7]);
		m3.add(c1);
		m3.add(mi[8]);
		m3.add(mi[9]);
		m3.add(mi[10]);
		
		mi[0].addActionListener(this);
		mi[1].addActionListener(this);
		mi[2].addActionListener(this);
		mi[3].addActionListener(this);
		c1.addItemListener(this);
		f.addWindowListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		mi[5].setEnabled(false);
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae)
	{
		MenuItem a=(MenuItem)ae.getSource();
		if(a==mi[0])
			System.out.println("new is Clicked");
		else if(a==mi[1])
			System.out.println("File Saved");
		else if(a==mi[2])
			System.out.println("File Opened");
		else if(a==mi[3])
			System.exit(0);
	}

	public static void main(String []ar)
	{
		notepad n=new notepad();
	}
}  