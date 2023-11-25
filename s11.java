Slip11_1: Define an interface “Operation” which has method volume( ).Define a constant PI having a value 3.142 Create a class cylinder which implements this interface (members – radius,height). Create one object and calculate the volume

import java.io.*;
interface Operation
{
 final static float pi=3.142f;
 void area();
 void volume();
}
class Cylinder implements Operation
{
 double radius,height;
 void input() throws Exception
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("\n Enter the radius and height=");
 radius=Double.parseDouble(br.readLine());
 height=Double.parseDouble(br.readLine());
 }
 public void area()
 {
 double a=(2*pi*radius*height)+(2*pi*radius*radius);
 System.out.println("the area of cylinder is " +a);
 }
 public void volume()
 {
 double v=pi*radius*radius*height;
 System.out.println("the volume of cylinder is "+v);
 }
}
 class demo
{
 public static void main(String args[]) throws Exception
 {
 Cylinder C1=new Cylinder();
 C1.input();
 C1.area();
 C1.volume();
 }
}
Slip11_2: Write a program to accept the username and password from user if username and password are not same then raise "Invalid Password" with appropriate msg.

import java.io.*;

class check extends Exception
{
	check(String msg)
	{
		super(msg);
	}
}
class demo
{
	public static void main(String args[])throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Username:");
	String uname=br.readLine();

	System.out.println("Enter Password:");
	String pwd=br.readLine();
	
	try
	{
		if(uname.equals(pwd))
		{
		System.out.println("Valid USername and password");
		}
		else
			throw new check("Invalid password");
	}
	catch(check e)
	{
		System.out.println("Error:"+e.getMessage());	
	}
	
	}
}
