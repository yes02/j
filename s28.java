Slip28_1: Write a program that reads on file name from the user, then displays information about whether the file exists, whether the file is readable, whether the file is writable, the type of file and the length of the file in bytes.

import java.util.*; 
import java.io.*; 
class FileReader 
{ 
 public static void main(String ar[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("enter file name"); 
 
 String f1=sc.next(); 
 File f=new File(f1); 
 
 if(f.exists()) 
 { 
 System.out.println("Name of the File is "+f.getName()); 
 
 if(f.canRead()) 
 System.out.println("File is Readable "); 
 else 
 System.out.println("File is not Readable "); 
 
 if(f.canWrite()) 
 System.out.println("File is Writeable"); 
 else 
 System.out.println("File is not Writeable"); 
 
 System.out.println("Length of the File= "+f.length()); 
 } 
 else 
 System.out.println("File not found!"); 
 } 
 }

Slip28_2: Write a program called SwingTemperatureConverter to convert temperature values between Celsius and Fahrenheit. User can enter either the Celsius or the Fahrenheit value, in floating-point number. Hints: To display a floating-point number in a specific format (e.g., 1 decimal place), use the static method String.format(), which has the same form as printf(). For example, String.format("%.1f", 1.234) returns String "1.2".
                      
import javax.swing.*; 
import java.util.*; 
import java.text.*; 
import java.awt.*; 
import java.awt.event.*; 
class demo extends KeyAdapter 
{ 
 JLabel l1,l2; 
 JTextField t1,t2; 
 demo() 
 { 
 JFrame ob=new JFrame("Temperature Converter"); 
 l1=new JLabel("Celsius"); 
 l2=new JLabel("Fahreheit"); 
 t1=new JTextField(10); 
 t2=new JTextField(10); 
 ob.add(l1); ob.add(t1); 
 ob.add(l2); ob.add(t2); 
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
 Double cels=Double.parseDouble(t1.getText()); 
 Double S= (cels * 1.8) + 32; 
 Formatter fob=new Formatter(); 
 fob.format("%.2f",S); 
 t2.setText(""+S); 
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

