Slip 24-1:
Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and Rs.200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank 
{ 
 public abstract void getBalance(); 
} 
class BankA extends Bank 
{ 
 int bal=100; 
 public void getBalance() 
 { 
 System.out.println("Balance of BankA is "+bal); 
 } 
} 
class BankB extends Bank 
{ 
 int bal=150; 
 public void getBalance() 
 { 
 System.out.println("Balance of BankB is "+bal); 
 } 
} 
class BankC extends Bank 
{ 
 int bal=200; 
 public void getBalance() 
 { 
 System.out.println("Balance of BankC is "+bal); 
 } 
 public static void main(String args[]) 
 { 
 BankA a=new BankA(); 
 BankB b=new BankB(); 
 BankC c=new BankC(); 
 a.getBalance(); 
 b.getBalance(); 
 c.getBalance(); 
 } 
}

Slip24_2: Program that displays three concentric circles where ever the user clicks the mouse on a frame. The program must exit when user clicks ‘X’ on the frame.
                           

import java.awt.Graphics; 
import javax.swing.JPanel; 
import java.awt.*; 
import java.applet.*; 
import javax.swing.*; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.geom.*; 
import javax.swing.JPanel; 
 class Ovals extends JPanel 
{ 
 private Graphics g; 
 private int prevX, prevY; 
 private String drawtype; 
 public Ovals() 
 { 
 addMouseListener(new MouseAdapter() 
 { 
 public void mousePressed(MouseEvent me) 
 { 
 selectpaint(); 
 } 
 }); 
 } 
 private void selectpaint() 
 { 
 g=getGraphics(); 
 Dimension d = getSize(); 
 int x =d.width/2; 
 int y = d.height/2; 
 int r1=(int) ((d.width < d.height)? 0.4*d.width: 0.4*d.height); 
 
 g.setColor(Color.red); 
 g.fillOval(x-r1, y-r1, 2*r1, 2*r1); 
 int r2 =(int) ((d.width < d.height)? 0.3*d.width: 0.3* d.height); 
 
 g.setColor(Color.blue); 
 g.fillOval(x-r2, y-r2, 2*r2, 2*r2); 
 int r3= (int) ((d.width < d.height)? 0.2*d.width: 0.2 *d.height); 
 
 g.setColor(Color.yellow); 
 g.fillOval(x-r3, y-r3, 2*r3, 2*r3); 
 } 
 // to choose polygon to draw 
 public static void main(String[] args) 
 { 
 Ovals ovalsPanel = new Ovals(); 
 JFrame newFrame = new JFrame(); 
 newFrame.getContentPane().add(new Ovals()); 
 newFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); // 
newFrame.add( ovalsPanel ); 
 newFrame.setSize( 550, 550 ); 
 newFrame.setVisible(true); 
 } 
}
