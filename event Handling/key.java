import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class key extends Applet implements KeyListener
{
	TextField t1;
	Label l1;
	GridLayout gd;
	public key()
	{
		t1=new TextField();
		l1=new Label();
		gd=new GridLayout(2,1);
		setLayout(gd);
		add(t1);
		add(l1);
		t1.addKeyListener(this);
	}
	public void keyTyped(KeyEvent k)
	{
		l1.setText("Key is Typed");
	}
	public void keyPressed(KeyEvent k)
	{
		l1.setText("Key is Pressed");
	}
	public void keyReleased(KeyEvent k)
	{
		l1.setText("Key is released");
	}
}

/*
<applet code=key width=500 height=500>
</applet>*/