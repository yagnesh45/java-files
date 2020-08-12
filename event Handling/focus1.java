import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class focus1 extends Applet implements FocusListener
{
	TextArea t1,t2;
	GridLayout gd;
	int x,y;
	public focus1()
	{
		t1=new TextArea();
		t2=new TextArea();
		
		gd=new GridLayout(2,1);
		t2.addFocusListener(this);
		setLayout(gd);
		add(t1);
		add(t2);
		
	}
	
	public void focusGained(FocusEvent fe)
	{
		t2.setText(t1.getText());
	}
	public void focusLost(FocusEvent fe)
	{
		//t2.setText(t.getText());
	}
	
}	
/* <applet code="focus1" height="500" width="500">
</applet>*/		