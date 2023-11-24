Slip19_1: Write a program to accept the two dimensional array from user and display 
sum of its diagonal elements.

import java.util.Scanner; 
class demo
{ 
 public static void main(String args[]) 
 { 
 int m, n, i, j,sum=0; 
 Scanner sc=new Scanner(System.in); 
 
 System.out.print("Enter order of matrix: "); 
 m = sc.nextInt(); 
 
 int array[][] = new int[m][m]; 
 System.out.println("Enter the elements of the array: "); 
 for (i = 0; i < m; i++) 
 for (j = 0; j < m; j++) 
 array[i][j] = sc.nextInt(); 
 
 System.out.println("Elements of the array are: "); 
 for (i = 0; i < m; i++) 
 { 
 for (j = 0; j < m; j++) 
 { 
 System.out.print(array[i][j] + " "); 
 if(i==j) 
 sum+=array[i][j]; 
 } 
 System.out.println(); 
 } 
 System.out.println("Sum of Diagonal elements is "+sum); 
 
 } 
}

Slip19_2: Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci) subjects. Display the selected subject in a text field

import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*;  
public class demo extends JFrame implements ItemListener
{    
    JComboBox cb;
    JTextField t1;
    demo()
    {   
	setLayout(new FlowLayout());   
String sub[]={"TCS","JAVA","WT","FDS","OS"};
        	cb=new    JComboBox(sub);    

	add(cb);        
           
            setSize(400,500);    
          
	cb.addItemListener(this);
	t1=new JTextField("selected subjects:"); 
	add(t1);
setVisible(true); 	         
     }    
     public void itemStateChanged(ItemEvent E)
     {
		t1.setText(cb.getSelectedItem() + " selected");
     } 
     public static void main(String[] args) 
     {    
       new demo();    
     }    
}  
