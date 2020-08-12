import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class focus extends Applet implements FocusListener
{
	TextField t1,t2;
	public focus()
	{
		t1=new TextField("hello world!");
		t2=new TextField();
		add(t1);
		add(t2);
		t1.addFocusListener(this);
	}
	
	public void focusLost(FocusEvent fe)
	{
		t2.setText(t1.getText());
	}
	public void focusGained(FocusEvent fe)
	{}
}

/*
<applet code=focus height=500 width=500>
</applet>*/