import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class chat extends WindowAdapter{
	
	JTextArea text1,text2;
	JButton btn,btn2;
	JLabel label;
	GridBagLayout gLayout;
	GridBagConstraints gc;
	public chat(String name)
	{
		JFrame frame = new JFrame();
		gLayout=new GridBagLayout();
		gc=new GridBagConstraints();
		
		gc.fill=GridBagConstraints.BOTH;
		frame.setTitle("Chat messanger "+name);
		frame.setLayout(gLayout);
		text1 = new JTextArea(20,20);
		text2 = new JTextArea(3,10);
		btn = new JButton("Send");
		btn2 = new JButton("Clear");
		
		gc.gridwidth=2;
		gc.gridx=0;
		gc.gridy=0;
		frame.add(text1,gc);
	
		gc.gridwidth=1;
		gc.gridheight=2;
		gc.gridx=0;
		gc.gridy=1;
		gc.weighty=20;
		frame.add(text2,gc);
		
		gc.gridx=1;
		gc.gridy=1;
		gc.gridheight=1;
		frame.add(btn,gc);
		
		gc.gridy=2;
		frame.add(btn2,gc);
		
		frame.addWindowListener(this);
		frame.setSize(500,500);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Button clicked!");
			}
		});
		frame.setVisible(true);
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}