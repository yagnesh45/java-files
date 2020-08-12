import java.applet.*;
import java.awt.*;

public class form1 extends Applet
{
	Label l1;
	TextField t1;
	Button b1;
	Checkbox c1;
	CheckboxGroup c2;
	Choice c3;
	GridLayout gd;
	public form1()
	{
		l1=new Label("Name");
		c1=new Checkbox();
		t1=new TextField(30);
		//c2=new CheckboxGroup();
		b1=new Button("Login");
		c3=new Choice();
		gd=new GridLayout(3,2);
		setLayout(gd);
		add(l1);
		add(t1);
		add(c1);
		//c2.add("hello");
		add(c3);
		add(b1);
	}
}

/*<applet code="form1" height="300" width="300">
</applet> */
		