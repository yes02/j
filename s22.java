Slip22_1: Write a program to create an abstract class named Shape that contains two integers and an empty method named printArea(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method printArea() that prints the area of the given shape. (use method overriding)

import java.util.*; 
abstract class Shape 
{ int n1,n2; 
 public abstract void printArea(); 
 } 
class Rectangle extends Shape 
{ 
 Rectangle(int a,int b) 
 { 
 n1=a; 
 n2=b; 
 } 
 public void printArea() 
 { 
 float area; 
 area=n1*n2; 
 System.out.println("area of rectangle="+area); 
 } 
} 
class Triangle extends Shape 
{ 
 Triangle(int a,int b) 
 { 
 n1=a; 
 n2=b; 
 } 
 public void printArea() 
 { 
 float area; 
 area=(n1*n2)/2; 
 System.out.println("area of triangle="+area); 
 } 
} 
class Circle extends Shape 
{ 
 Circle(int a) 
 { 
 n1=a; 
 } 
 public void printArea() 
 { 
 System.out.println("area of circle="+3.142*n1*n1); 
 } 
} 
class Area 
{ 
 public static void main(String args[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("enter 2 values"); 
 int n1=sc.nextInt(); 
 int n2=sc.nextInt(); 
 Rectangle ob=new Rectangle(n1,n2); 
 
 ob.printArea(); 
 Triangle tr=new Triangle(n1,n2); 
 tr.printArea(); 
 Circle cr=new Circle(n1); 
 cr.printArea(); 
 } 
}

Slip22_2: Write a program that handles all mouse events and shows the event name at the center of the Window, red in color when a mouse event is fired. (Use adapter classes).

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class MouseEvents extends JFrame implements MouseListener, MouseMotionListener 
{ 
String str=""; 
JTextArea ta; 
Container c; 
int x,y; 
MouseEvents() 
{ 
 c=getContentPane(); 
 c.setLayout(new FlowLayout());; 
 
 ta=new JTextArea("Click the mouse or move it", 5,20); 
 ta.setFont(new Font("Arial",Font.BOLD,30)); 
 ta.setForeground(new Color(255,0,0)); 
 c.add(ta); 
 ta.addMouseListener(this); 
 ta.addMouseMotionListener(this); 
 } 
public void mouseClicked(MouseEvent me) 
{ 
 int i=me.getButton(); 
 if(i==1) 
 str+="Clicked Button: Left"; 
 else if(i==2) 
 str+="Clicked Button: Middle"; 
 else if(i==3) 
 str+="Clicked Button: Right"; 
 this.display(); 
 } 
public void mouseEntered(MouseEvent me) 
{ 
 str+="Mouse Entered "; 
 this.display(); 
} 
public void mouseExited(MouseEvent me) 
{ 
 str+="MouseExited"; 
 this.display(); 
 } 
public void mousePressed(MouseEvent me) 
{ 
 x=me.getX(); 
 y=me.getY(); 
 str+="MousePressed at: "+x+"\t"+y; 
 this.display(); 
} 
public void mouseReleased(MouseEvent me) 
{ 
 x=me.getX(); 
 y=me.getY(); 
 str+="Mouse Released at:"+x+"\t"+y; 
 this.display(); 
 } 
public void mouseDragged(MouseEvent me) 
{ 
 x=me.getX(); 
 y=me.getY(); 
 str+="MouseDragged at:"+x+"\t"+y; 
 this.display(); 
} 
public void mouseMoved(MouseEvent me) 
{ 
 x=me.getX(); 
 y=me.getY(); 
 str+="Mouse Moved at:"+x+"\t"+y; 
 this.display(); 
} 
public void display() 
{ 
 ta.setText(str); 
 str=""; 
} 
 public static void main(String[] args) { 
 
 MouseEvents mes=new MouseEvents(); 
 mes.setSize(400,400); 
 mes.setVisible(true); 
 mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 } 
 }
