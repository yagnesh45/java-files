import java.applet.*;
import java.awt.*;

public class form extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	GridLayout gd;
	public form()
	{
		l1=new Label("Name");
		l2=new Label("Password");
		t1=new TextField(30);
		t2=new TextField(30);
		b1=new Button("Login");
		b2=new Button("Reset");
		gd=new GridLayout(3,2);
		setLayout(gd);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
	}
}

/*<applet code="form" height="300" width="300">
</applet> */
		