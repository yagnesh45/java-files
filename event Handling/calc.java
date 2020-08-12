import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener
{
	TextField t1,t2,Ans;
	Button add1,sub,mul,div;
	GridLayout gd1,gd2,gd3;
	Panel p,p2;
	public calc()
	{
		t1=new TextField(); 
		t2=new TextField();		
		Ans=new TextField("ans=");
		add1=new Button("+");
		sub=new Button("-");
		mul=new Button("x");
		div=new Button("/");
		p=new Panel();
		p2=new Panel();
		gd1=new GridLayout(4,1);
		gd2=new GridLayout(1,4);
		gd3=new GridLayout(1,1);
		setLayout(gd1);
		add(t1);
		add(t2);
		t1.setBackground(Color.RED);
		t2.setBackground(Color.YELLOW);
		p.setLayout(gd2);
		add(p);
		p.add(add1);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p2.setLayout(gd3);
		add(p2);
		p2.add(Ans);
		Ans.setBackground(Color.ORANGE);
		add1.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String a=ae.getActionCommand();
		String ans1=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		String ans2=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
		String ans3=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
		String ans4=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
		if(a.equals("+"))
			Ans.setText(ans1);
		else if(a.equals("-"))
			Ans.setText(ans2);
		else if(a.equals("x"))
			Ans.setText(ans3);
		else
			Ans.setText(ans4);
	}
}


/*
<applet code=calc height=500 width=500>
</applet>
*/