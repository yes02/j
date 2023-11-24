Slip4_1: Write a program to print an array after changing the rows and columns of a given two dimensional array.

import java.util.*;
class demo
{
   public static void main(String args[])
   {
 	System.out.println("enter the row and column");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
  	int c = sc.nextInt();
 	int mat[][] = new int[r][c];
	System.out.println("enter the array elts:");
	for(int i=0;i<r;i++)
 	{
	 for(int j=0;j<c;j++)
 	 {
		 mat[i][j] = sc.nextInt();
 	 }
        }
	System.out.println("the matrix is:");
 	for(int i=0;i<c;i++)
 	{
	 for(int j=0;j<r;j++)
 	 {
		 System.out.print(" " +mat[j][i]);
 	 }
	 System.out.println(" ");
        }
     }
}  
Slip4_2: Write a program to design a screen using Awt that will take a user name and password. If the user name and password are not same, raise an Exception with appropriate message. User can have 3 login chances only. Use clear button to clear the TextFields.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class attemptcheck extends Exception
{
	attemptcheck(String msg)
	{
		super(msg);
	}
}
class logindemo extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	static int cnt=0;
	logindemo()
	{
		setLayout(new FlowLayout());
		setSize(300,300);
		
		l1=new JLabel("User Name");
		add(l1);
		t1=new JTextField(20);
		add(t1);
		
		l2=new JLabel("Password");
		add(l2);
		t2=new JPasswordField();
		add(t2);

		b1=new JButton("Login");
		add(b1);
		b1.addActionListener(this);

		b2=new JButton("Clear");
		add(b2);
		b2.addActionListener(this);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b1)
		{
			try
			{
				String s1=t1.getText();
				String s2=t2.getText();
				if(s1.equals(s2))
				{
		JOptionPane.showMessageDialog(this,"Login Successfull");	
				}
				else
				{
					cnt++;
	JOptionPane.showMessageDialog(this,"Wrong username:"+cnt);	
				}
				if(cnt>3)
				{
		throw new attemptcheck("Sorry 3 attempts finished..");
				}
			}
			catch(attemptcheck e)
			{
		JOptionPane.showMessageDialog(this,e.getMessage());	
			}
		}
		if(e1.getSource()==b2)
		{
			t1.setText("");	
			t2.setText("");	
		}
	}
	public static void main(String args[])
	{
		new logindemo();
	}
}
