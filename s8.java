Slip8_1: Create a class Sphere, to calculate the volume and surface area of sphere. (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))

import java.util.*;
class demo
{
 public static void main (String[] args)
 {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of the sphere: ");
	double radius=sc.nextDouble();
	double surface_area = (4*3.14*(radius*radius));
	double volume = ((double)4/3)*3.14*(radius*radius*radius);
   System.out.println("The surface area of the sphere = "+surface_area);
 	System.out.println("The volume of sphere = "+volume);
 }
}

Slip8_2: Design a screen to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField

import java.awt.*;
import java.awt.event.*;
class demo extends Frame
{
	TextField t,t1;
 	Label l,l1;
	int x,y;
	Panel p;
	demo()
 	{
	 setLayout(new FlowLayout());
	 p=new Panel();
	 p.setLayout(new GridLayout(2,2,5,5));
	 t=new TextField(20);
	 l= new Label("Co-ordinates of mouse clicking");
	 l1= new Label("Co-ordinates of mouse movement");
	 t1=new TextField(20);
	 p.add(l);
	 p.add(t);
	 p.add(l1);
	 p.add(t1);
	 add(p);
	 addMouseListener(new click());
	 addMouseMotionListener(new move());
	 setSize(500,500);
	 setVisible(true);
	 }
 class click extends MouseAdapter
 {
	 public void mouseClicked(MouseEvent me)
	 {
		 x=me.getX();
		 y=me.getY();
		 t.setText("X="+x+" Y="+y);
	 }
 }
 class move extends MouseMotionAdapter
 {
	 public void mouseMoved(MouseEvent me)
	 {	
		 x=me.getX();
		 y=me.getY();
		 t1.setText("X="+ x +" Y="+y);
 	  }
 }
}
class sample
{
 public static void main(String args[])
 {
 demo f = new demo();
 }
}
