import java.awt.*;
import java.util.*;
class watch extends Frame implements Runnable
{
	Label l1=new Label("Digital Watch");
	Label l2=new Label("H");
	Label l3=new Label("M");
	Label l4=new Label("S");
	TextField h=new TextField();
	TextField m=new TextField();
	TextField s=new TextField();
	Date dt;
	Thread th;
	watch()
	{
		setLayout(null);
		setFont(new Font("Arial",Font.BOLD,18));
		setBackground(Color.cyan);
		l1.setBounds(130,30,200,30);
		h.setBounds(120,80,40,30);
		m.setBounds(170,80,40,30);
		s.setBounds(220,80,40,30);
		l2.setBounds(130,110,20,30);
		l3.setBounds(180,110,20,30);
		l4.setBounds(230,110,20,30);
		add(l1);add(l2);add(l3);add(l4);add(h);add(m);add(s);
		setSize(400,400);
		setVisible(true);
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		while(true)
		{
			dt=new Date();
			h.setText(String.valueOf(dt.getHours()));
			m.setText(String.valueOf(dt.getMinutes()));
			s.setText(String.valueOf(dt.getSeconds()));
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
	public static void main(String args[])
	{
		new watch();
	}
}
				