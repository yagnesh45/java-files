import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class event7 extends Applet implements ActionListener
{
	TextField t1,bin,dec,hex,oct;
	Button b1,b2;
	Label l1,l2,l3,l4;
	GridLayout gd,gd2;
	Panel p,p2;
	public event7()
	{
		gd=new GridLayout(4,1);
		gd2=new GridLayout(1,2);
		p=new Panel();
		p2=new Panel();
		t1=new TextField(20);
		bin=new TextField(20);
		dec=new TextField(20);
		hex=new TextField(20);
		oct=new TextField(20);
		bin.setEditable(false);
		dec.setEditable(false);
		hex.setEditable(false);
		oct.setEditable(false);
		l1=new Label("Binary:");
		l2=new Label("Decimal:");
		l3=new Label("Octal:");
		l4=new Label("Hex:");
		b1=new Button("Convert");
		b2=new Button("Clear");
		setLayout(gd);
		add(t1);
		add(p);
		p.setLayout(gd);
		p.add(l1);
		p.add(bin);
		p.add(l2);
		p.add(dec);
		p.add(l3);
		p.add(oct);
		p.add(l4);
		p.add(hex);
		p2.setLayout(gd2);
		add(p2);
		p2.add(b1);
		p2.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button b=(Button)ae.getSource();
		if(b==b1)
		{
			String str=t1.getText();
			int a=Integer.parseInt(str);
			String bi = Integer.toBinaryString(a);
			String o = Integer.toOctalString(a);
			String h = Integer.toHexString(a);
			bin.setText(bi);
			dec.setText(str);
			oct.setText(o);
			hex.setText(h);
		}
		else
		{
			t1.setText("");
			bin.setText("");
			dec.setText("");
			oct.setText("");
			hex.setText("");
		}	
	}
}	
			
	
		
/* <applet code="event7" height="500" width="500">
</applet>*/		
