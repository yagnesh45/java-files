import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class tictac extends Applet implements ActionListener
{
	GridLayout gd1,gd2,gd3,gd4;
	Panel p[]=new Panel[4],p1;
	Button b[]=new Button[9],newgame,sign,o,x;
	TextField t;
	
	Boolean flag=true;
	int f[]=new int[9],c=0;
	
	public tictac()
	{
		gd1=new GridLayout(5,1);
		gd2=new GridLayout(1,3);
		gd3=new GridLayout(1,2);
		//gd4=new GridLayout(1,2);
		p1=new Panel();
		for(int i=0;i<4;i++)
		{	
			p[0] = new Panel();
			p[1] = new Panel();
			p[2] = new Panel();
			p[3] = new Panel();
		}
		for(int i=0;i<9;i++)
		{
			b[i]=new Button("");
			f[i]=0;	
		}
		t=new TextField(20);
		t.setEditable(false);;
		newgame=new Button("New Game");
		newgame.setBackground(Color.ORANGE);
		//sign=new Button("Change Sign");
		o=new Button("X");
		x=new Button("O");
		
		
		setLayout(gd1);
		add(p[0]);
		p[0].setLayout(gd2);
		p[0].add(b[0]);
		p[0].add(b[1]);
		p[0].add(b[2]);
		
		add(p[1]);
		p[1].setLayout(gd2);
		p[1].add(b[3]);
		p[1].add(b[4]);
		p[1].add(b[5]);
		
		add(p[2]);
		p[2].setLayout(gd2);
		p[2].add(b[6]);
		p[2].add(b[7]);
		p[2].add(b[8]);
		
		add(p[3]);
		p[3].setLayout(gd3);;
		p[3].add(newgame);
		//p[3].add(sign);
	
				
		
		add(t);
		
		newgame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				for(int i=0;i<b.length;i++)
				{
					b[i].setLabel(" ");
					b[i].setBackground(null);
					b[i].setEnabled(true);
					flag=true;
				}
				t.setText("Game Started");
			}
		});
		
		/*sign.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				p1.setLayout(gd3);
				p1.add(o);
				p1.add(x);
				p[3].add(p1);
			}
		});*/
		
		for(int i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);	
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button button = (Button) ae.getSource();
		c++;
		if(flag)
		{
			for(int i=0;i<b.length;i++)
			{
				if(button==b[i])
				{
					b[i].setLabel("O");
					b[i].setEnabled(false);
					b[i].setBackground(Color.RED);
					//b[i].setForeground(Color.BLUE);
					flag=false;
					f[i]=1;
				}
			}
		}		
		else
		{
			for(int i=0;i<b.length;i++)
			{					
				if(button==b[i])
				{
					b[i].setLabel("X");
					b[i].setBackground(Color.BLUE);
					//b[i].setForeground(Color.RED);
					b[i].setEnabled(false);
					flag=true;
					f[i]=-1;
				}
			}
		}
		
		
		if(f[0]==f[1] && f[0]==f[2] && f[0]!=0)
		{
			winner();		
		}
		else if(f[3]==f[4] && f[3]==f[5] && f[3]!=0)
		{
			winner();
		}
		else if(f[6]==f[7] && f[6]==f[8] && f[6]!=0)
		{
			winner();
		}	
		else if(f[0]==f[4] && f[0]==f[8] && f[0]!=0)
		{
			winner();
		}
		else if(f[2]==f[4] && f[2]==f[6] && f[2]!=0)
		{
			winner();
		}	
		else if(f[0]==f[3] && f[0]==f[6] && f[0]!=0)
		{
			winner();
		}
		else if(f[1]==f[4] && f[1]==f[7] && f[1]!=0)
		{
			winner();
		}
		else if(f[2]==f[5] && f[1]==f[8] && f[2]!=0)
		{
			winner();
		}

		if(c==9)
		{
			t.setText("Draw");	
			flag=true;
			for(int i=0;i<b.length;i++)
			{	
				f[i]=0;
				b[i].setEnabled(false);
			}
		}
	}
	public void winner()
	{
		if(flag==false){
			t.setText("Player 1 Win!");
			t.setBackground(Color.CYAN);
		}
		else{
			t.setText("Player 2 Win!");	
			t.setBackground(Color.CYAN);
		}
		flag=true;
		for(int i=0;i<b.length;i++)
		{	
			f[i]=0;
			b[i].setEnabled(false);
		}
		c=0;
	}
}


/* <applet code="tictac" height="500" width="500">
</applet>*/