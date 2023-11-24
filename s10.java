Slip10_1: Write a program to find the cube of given number using //functional interface.

import java.util.*;
interface Cube
{
	float cube();
}
class demo implements Cube
{
	public float cube()
	{
		System.out.println("enter the number");
		Scanner sc= new Scanner (System.in);
		float cu = sc.nextInt(); 
		double cue = cu*cu*cu;
		System.out.println("cube of no is:"+cue);
		return 0;
	}
	public static void main(String args[])
	{
		 demo d = new demo();
 		 d.cube();
	}
}

Slip10_2: Write a program to create a package name student. Define class StudentInfo with method to display information about student such as rollno, class, and percentage. Create another class StudentPer with method to find percentage of the student. Accept student details like rollno, name, class and marks of 6 subject from user.

//studentinfo.java
package student;

public class studentinfo
{
	public int rollno;
	public String name;	
	public void display()
	{
		System.out.println("Roll no:"+rollno);
		System.out.println("Name:"+name);	
	}
}
//studentper.java
package student;
public class studentper
{
	public void find(int a,int b,int c,int d,int e,int f)
	{
		double per=(a+b+c+d+e+f)/6;
		System.out.println("Percentage="+per);
	}
}

//demo.java
import student.studentper;
import student.studentinfo;
import java.io.*;
class demo
{
	public static void main(String args[])throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Rollno:");
	int rollno=Integer.parseInt(br.readLine());
	System.out.println("Enter Name:");
	String name=br.readLine();
	System.out.println("Enter first marks:");
	int m1=Integer.parseInt(br.readLine());
	System.out.println("Enter second marks:");
	int m2=Integer.parseInt(br.readLine());
	System.out.println("Enter third marks:");
	int m3=Integer.parseInt(br.readLine());
	System.out.println("Enter 4th marks:");
	int m4=Integer.parseInt(br.readLine());
	System.out.println("Enter 5th marks:");
	int m5=Integer.parseInt(br.readLine());
	System.out.println("Enter 6th marks:");
	int m6=Integer.parseInt(br.readLine());
	
	studentinfo s2=new studentinfo();
	s2.rollno=rollno;
	s2.name=name;
	s2.display();	

	studentper s1=new studentper();
	s1.find(m1,m2,m3,m4,m5,m6);
	}
}
