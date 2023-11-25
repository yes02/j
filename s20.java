Slip20_1: Write a Program to illustrate multilevel Inheritance such that country is inherited from continent. State is inherited from country. Display the place, state, country and continent

import java.util.*; 
class continent 
{ 
 String c1; 
 } 
class country extends continent 
{ 
 String c2; 
} 
class state extends country 
{ 
 String s1; 
 String p1; 
 public void display() 
 { 
 System.out.println("Continent name: "+c1+"\n"+"Country name:"+c2+"\n"+"State Name: "+s1+"\n"+"Place: "+p1); 
 } 
public static void main(String args[]) 
 { 
 state ob=new state(); 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the continent"); 
 ob.c1=sc.next(); 
 System.out.println("Enter the Country"); 
 ob.c2=sc.next(); 
 System.out.println("Enter the state"); 
 ob.s1=sc.next(); 
 System.out.println("Enter the place"); 
 ob.p1=sc.next(); 
 ob.display();  
 } 
}

Slip20_2: Write a package for Operation, which has two classes, Addition and Maximum. Addition has two methods add () and subtract (), which are used to add two integers and subtract two, float values respectively. Maximum has a method max () to display the maximum of two integers

//Addition.java
package operation; 
import java.util.*; 
 class Addition 
 { 
 public int ans,n1,n2; 
 public float answer,num1,num2; 
 public Addition(int n1,int n2,float num1,float num2) 
 { 
 this.n1=n1; 
 this.n2=n2; 
 this.num1=num1; 
 this.num2=num2; 
 
 } 
 public void add() 
 {  
 ans=n1+n2; 
 System.out.println("addition is="+ans); 
 } 
 
 public void sub() 
 { 
 answer=num1-num2; 
 System.out.println("subtraction is="+answer); 
 } 
 } 

 //Maximum.java
 public class Maximum extends Addition 
 { 
  public Maximum(int n1,int n2, float num1, float num2) 
 { 
 super(n1,n2,num1,num2); 
 } 
 public void max() 
 { 
 if (n1>n2) 
 System.out.println(n1+" is greater than "+n2); 
 else 
 System.out.println(n2+" is greater than "+n1); 
 } 
 } 

//demo.java
import operation.Maximum; 
import operation.Addition; 
import java.util.*; 
class demo
{ 
 public static void main (String args[]) 
 {  
 int n1,n2; 
 float num1,num2; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter first no="); 
 n1=sc.nextInt(); 
 System.out.println("Enter second no="); 
 n2=sc.nextInt(); 
 System.out.println("Enter third no="); 
 num1=sc.nextFloat(); 
 System.out.println("Enter fourth no="); 
 num2=sc.nextFloat(); 
 
 Maximum ob1=new Maximum(n1,n2,num1,num2); 
 
 ob1.add(); 
 ob1.sub(); 
 ob1.max();  
 } 
}
