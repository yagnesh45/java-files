import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class notepad extends WindowAdapter implements ActionListener,ItemListener
{
	JFrame f;
	//Font f1;
//	JFontChooser fc1;
	JMenuBar mb;
	FileDialog fd1,fd;
	int i=1;
	JMenu m1,m2,m3,m4;
	JTextArea t1;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14;
	JCheckBoxMenuItem c1;
	notepad()
	{
		f=new JFrame();
		f.setTitle("Notepad");
		mb=new JMenuBar();
		t1=new JTextArea();
		m1=new JMenu("File");
		m1.setMnemonic(KeyEvent.VK_F);
		m2=new JMenu("Edit");
		m2.setMnemonic(KeyEvent.VK_E);
		m3=new JMenu("Format");
		m3.setMnemonic(KeyEvent.VK_O);
		m4=new JMenu("Help (?)");
		m4.setMnemonic(KeyEvent.VK_H);
		mi1=new JMenuItem("new");
		mi1.setMnemonic(KeyEvent.VK_N);
		mi2=new JMenuItem("save");
		mi3=new JMenuItem("Open");
		mi4=new JMenuItem("Exit");
		mi5=new JMenuItem("Clear all");
		mi6=new JMenuItem("Go to");
		mi7=new JMenuItem("Copy");
		mi8=new JMenuItem("Paste");
		c1=new JCheckBoxMenuItem("Wrap Text");
		mi10=new JMenuItem("Set Font");
		//mi11=new JMenuItem("Set Font-color");
		mi12=new JMenuItem("Preferences");
		mi13=new JMenuItem("About");
		mi14=new JMenuItem("Update your app");
		mi9=new JMenuItem("FAQ");
		f.setJMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		m3.add(c1);
		m3.add(mi10);
		//m3.add(mi11);
		m3.add(mi12);
		m4.add(mi13);
		m4.add(mi14);
		m4.add(mi9);
		f.add(t1);
		f.setSize(500,500);
		f.setVisible(true);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi10.addActionListener(this);
		c1.addItemListener(this);
		f.addWindowListener(this);
		mi13.addActionListener(this);
		mi14.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState()==true)
			mi6.setEnabled(false);
		else
			mi6.setEnabled(true);
	}
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JMenuItem a=(JMenuItem)ae.getSource();
		if(a==mi1)
		{
			new1();
		}
		else if(a==mi2)
		{
			Save1();
		}
		else if(a==mi3)
			Open1();
		else if(a==mi4)
		{
			System.exit(0);
		}
		else if(a==mi5)  
			t1.setText(" ");
		else if(a==mi13)
		{
			t1.setText("Created by Yagnesh :)");
		}/*
		else if(a==mi10)
		{
			set_font();
		}*/
		else if(a==mi14)
		{
			t1.setText("Your App is already up to date");
		}
	}

	public static void main(String []ar)
	{
		notepad n=new notepad();
	}
	void new1()
	{
		JFrame f2=new JFrame("untitled");
		notepad n2=new notepad();
	}
	void Open1()
	{
		fd=new FileDialog(f,"open a file");
		fd.setVisible(true);
	}
	void Save1()
	{
		try{
			fd1.setVisible(true);
			FileWriter log=new FileWriter("Document"+i,true);
			i++;
			t1.write(log);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}/*
	void set_font()
	{
		fc1=new JFontChooser(f,"choose your font");
	}*/
}  