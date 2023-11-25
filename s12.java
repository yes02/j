Slip12_1: Write a program to create parent class College(cno, cname, caddr) and derived class Department(dno, dname) from College. Write a necessary methods to display College details.

import java.util.*;
class college
{
 int no;
 String name;
 String addr;
}
class Dept extends college
{
 int dno;
 String dname;
 Scanner sc = new Scanner(System.in);
 public void accept()
 {
 System.out.println("enter no");
 no=sc.nextInt();
 System.out.println("enter name");
 name=sc.next();
 System.out.println("enter college address");
 addr=sc.next();
 System.out.println("enter depatrment no");
 dno=sc.nextInt();
 System.out.println("enter department name");
 dname=sc.next();
 }
 public void display()
 {
 System.out.println("college no"+no);
 System.out.println("college name"+name);
 System.out.println("college address"+addr);
 System.out.println("department number"+dno);
 System.out.println("department number"+dname);
 }
 public static void main(String a[])
 {
 Dept ob=new Dept();
 ob.accept();
 ob.display();
 }
}

Slip12_2: Write a java program that works as a simple calculator. Use a grid layout to arrange buttons for the digits and for the +, -, *, % operations. Add a text field to display the result.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class demo extends JFrame implements ActionListener{
 String msg=" ";
 int v1,v2,result;
 JTextField t;
 JButton b[]=new JButton[10];
 JButton add,sub,mul,div,clear,equals;
 char choice;
 JPanel p,p1;
 public demo()
 {
  setSize(500,500);
 setLayout(new BorderLayout());
 p =new JPanel();
 t=new JTextField(20);
 p.add(t);

 p1=new JPanel();
 p1.setLayout(new GridLayout(5,4));
 for(int i=0;i<10; i++)
 {
 b[i]=new JButton(""+i);
 }
 equals=new JButton("=");
 add=new JButton("+");
 sub=new JButton("-");
 mul=new JButton("*");
 div=new JButton("/");
 clear=new JButton("C");
 for(int i=0;i<10;i++)
 {
 p1.add(b[i]);
 }
 p1.add(equals);
 p1.add(add);
 p1.add(sub);
 p1.add(mul);
 p1.add(div);
 p1.add(clear);

 for(int i=0;i<10;i++)
 {
 b[i].addActionListener(this);
 }
 add.addActionListener(this);
 sub.addActionListener(this);
 mul.addActionListener(this);
 div.addActionListener(this);
 clear.addActionListener(this);
 equals.addActionListener(this);

 add(p,BorderLayout.NORTH);
 add(p1);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 char ch = str.charAt(0);
 if ( Character.isDigit(ch))
 t.setText(t.getText()+str);
 else
 if(str.equals("+"))
 {
 v1=Integer.parseInt(t.getText()); choice='+';
 t.setText("");
 }
 else if(str.equals("-"))
 {
 v1=Integer.parseInt(t.getText()); choice='-';
 t.setText("");
 }
 else if(str.equals("*"))
 {
 v1=Integer.parseInt(t.getText()); choice='*';
 t.setText("");
 }
 else if(str.equals("/"))
 {
 v1=Integer.parseInt(t.getText()); choice='/';
 t.setText("");
 }

 if(str.equals("="))
 {
 v2=Integer.parseInt(t.getText()); if(choice=='+')
 result=v1+v2;
 else if(choice=='-')
 result=v1-v2;
 else if(choice=='*')
 result=v1*v2;
 else if(choice=='/')
 result=v1/v2;

 t.setText(""+result);
 }
 if(str.equals("C"))
 {
 t.setText("");
 }
 }
 public static void main(String args[])
 {
 new demo();
 }
}

