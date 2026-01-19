import java.awt.*;
import java.awt.event.*;

class CalculatorDemo extends Frame implements ActionListener 
{
	Panel p1,p2;
    Label lblR;
    Button btnA,btnC,btnE,btnD,btnM,btnS,btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;

	double a=0.0,b=0.0,c=0.0;
	int op=0;

    public CalculatorDemo() 
	{
        super("Calculator Demo");
        addWindowListener(new WindowAdapter() 
							{
								public void windowClosing(WindowEvent we) 
								{
									System.exit(0);
								}
							}
		);
        setSize(300,500);
		setBounds((1920/2)-(500/2),(1080/2)-(400/2),500,400);
        setResizable(false);
		
		p1=new Panel();
		p2=new Panel();
		
        p1.setFont(new Font("Serif", Font.PLAIN,60));
		p2.setFont(new Font("Algerian", Font.BOLD,40));

        lblR = new Label("0",lblR.RIGHT);
	
        btnA = new Button("+");
        btnS = new Button("-");
		btnM = new Button("*");
		btnD = new Button("/");
	    btnE = new Button("="); 
	    btnC = new Button("C"); 
	    btn0 = new Button("0");
	    btn1 = new Button("1"); 
		btn2 = new Button("2");
	    btn3 = new Button("3");
		btn4 = new Button("4");
	    btn5 = new Button("5");
		btn6 = new Button("6");
	    btn7 = new Button("7"); 
	    btn8 = new Button("8"); 
	    btn9 = new Button("9"); 
	
		p1.setLayout(new BorderLayout());
		p2.setLayout(new GridLayout(4,4));
		setLayout(new BorderLayout());
		
		p1.add(lblR,BorderLayout.NORTH);
		
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btnA);
		
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btnS);
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btnM);
		
		p2.add(btn0);
		p2.add(btnC);
		p2.add(btnE);
		p2.add(btnD);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		
		btnA.addActionListener(this);
        btnS.addActionListener(this);
		btnM.addActionListener(this);
		btnD.addActionListener(this);
	    btnE.addActionListener(this); 
	    btnC.addActionListener(this); 
	    btn0.addActionListener(this); 
	    btn1.addActionListener(this); 
		btn2.addActionListener(this);
	    btn3.addActionListener(this);
		btn4.addActionListener(this);
	    btn5.addActionListener(this);
		btn6.addActionListener(this);
	    btn7.addActionListener(this);
	    btn8.addActionListener(this);
		btn9.addActionListener(this);
		
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn0)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+0;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn1)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+1;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn2)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+2;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn3)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+3;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn4)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+4;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn5)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+5;
			lblR.setText(String.valueOf(a));
		} 
     	if(ae.getSource()==btn6)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+6;
			lblR.setText(String.valueOf(a));
		}
		
      	if(ae.getSource()==btn7)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+7;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn8)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+8;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btn9)
		{
			a=Double.valueOf(lblR.getText());
			a=a*10+9;
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btnC)
		{
			a=Double.valueOf(lblR.getText());
			a=Math.floor(a/10);
			lblR.setText(String.valueOf(a));
		}
		if(ae.getSource()==btnA)
		{
			b=a;
			a=0;
			lblR.setText(String.valueOf(a));
			op=1;
		}
		if(ae.getSource()==btnS)
		{
			b=a;
			a=0;
			lblR.setText(String.valueOf(a));
			op=2;
		}
		if(ae.getSource()==btnM)
		{
			b=a;
			a=0;
			lblR.setText(String.valueOf(a));
			op=3;
		}
		if(ae.getSource()==btnD)
		{
			b=a;
			a=0;
			lblR.setText(String.valueOf(a));
			op=4;
		}
		if(ae.getSource()==btnE)
		{
			if(op==1)
			{
				c=b+a;
				lblR.setText(String.valueOf(c)); 
			}
			if(op==2)
			{
				c=b-a;
				lblR.setText(String.valueOf(c)); ;
			}
			if(op==3)
			{
				c=b*a;
				lblR.setText(String.valueOf(c)); ;
			}
			if(op==4)
			{
				c=b/a;
				lblR.setText(String.valueOf(c)); ;
			}
			a=c;
		}
		
    }
}

public class Calculator
 {
    public static void main(String[] args) 
	{
        new CalculatorDemo();
    }
}