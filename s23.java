Slip23_1: Define a class MyNumber having one private int data member. Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main.Use command line arguments to pass a value to the Object.

import java.util.*; 
class demo 
{ 
 private int data; 
 demo() 
 { 
 data=0; 
 } 
 demo(int data) 
 { 
 this(); 
 this.data=data; 
 } 
 public void isPositive(int x) 
 { 
 if(x>0) 
 { 
 System.out.println(x+" Number is Positive "); 
 } 
 } 
 public void isNegetive(int x) 
 { 
 if(x<0) 
 { 
 System.out.println(x+" Number is Negetive"); 
 } 
 } 
 public void isEven(int x) 
 { 
 if(x%2==0) 
 { 
 System.out.println(x+" Number is Even"); 
 } 
 } 
 public void isOdd(int x) 
 { 
 if(x%2!=0) 
 { 
 System.out.println(x+" Number is Odd "); 
 } 
 } 
 public void isZero(int x) 
 { 
 if(x==0) 
 { 
 System.out.println(x+" Number is Zero "); 
 } 
 } 
 public static void main(String args[]) 
 { 
 int data=Integer.parseInt(args[0]); 
 demo ob =new demo(data); 
 ob.isPositive(data); 
 ob.isNegetive(data); 
 ob.isEven(data); 
 ob.isOdd(data); 
 ob.isZero(data); 
 } 
}

Slip23_2: Write a simple currency converter, as shown in the figure. User can enter the amount of "Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD, 1 USD = 0.92 Euro, 1 SGD = 0.65 Euro

import javax.swing.*; 
import java.util.*; 
import java.text.*; 
import java.awt.*; 
import java.awt.event.*; 
class demo extends KeyAdapter 
{ 
 JLabel l1,l2,l3; 
 JTextField t1,t2,t3; 
 demo() 
 { 
 JFrame ob=new JFrame(); 
 l1=new JLabel("US Dollars"); 
 l2=new JLabel("Singapore Dollars"); 
 l3=new JLabel("Euros"); 
 t1=new JTextField(10); 
 t2=new JTextField(10); 
 t3=new JTextField(10); 
 ob.add(l1); ob.add(t1); 
 ob.add(l2); ob.add(t2); 
 ob.add(l3); ob.add(t3); 
 ob.setVisible(true); 
 t1.addKeyListener(this); 
 ob.setLayout(new FlowLayout()); 
 ob.setSize(400,400); 
 ob.setDefaultCloseOperation(3); 
 } 
 
 public void keyReleased(KeyEvent ke) 
 { 
 try 
 { 
 Double USD=Double.parseDouble(t1.getText()); 
 Double S=1.41; 
 Double E=0.92; 
 //Double sgd =Double.parseDouble(t1.getText()); 
 Double SGD= USD * S; 
 //Double euro =Double.parseDouble(t1.getText()); 
 Formatter fob=new Formatter(); 
 fob.format("%.2f",SGD); 
 Double Euro=USD * E; 
 fob.format("%.2f",Euro); 
 t2.setText(""+SGD); 
 t3.setText(""+Euro); 
 } 
 catch(Exception e) 
 { 
 System.out.println("Enter Vaules in Box"); 
 } 
 } 
 public static void main(String []args) 
 { 
 demo ob=new demo(); 
 Scanner sc=new Scanner(System.in);  
 } 
 }

