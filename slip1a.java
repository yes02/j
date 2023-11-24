Slip no 1-1
Write a Program to print all Prime numbers in an array of ‘n’ elements. (use command line arguments)
class demo
{
 public static void main (String[] args)
 {
	 int size = args.length;
	 int[] array = new int [size];
	 for(int i=0; i<size; i++)
	 {
		 array[i] = Integer.parseInt(args[i]);
	 }
	 for(int i=0; i<array.length; i++)
	 {
		 boolean isPrime = true;
		 for (int j=2; j<array[i]; j++)
		 {
			 if(array[i]%j==0)
			 {
				 isPrime = false;
				 break;
			 }
		 }
		 if(isPrime)
 System.out.println(array[i] + " are the prime numbers in the array ");
	 }
 }
}

Slip 1: 2
Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of OfficeStaff and display all details.*/

import java.io.*;
abstract class staff
{
	protected int mid;
	protected String name;
	staff(int mid,String name)
	{
		this.mid=mid;
		this.name=name;	
	}
	abstract void display();
}
class officestaff extends staff
{
	String dname;
	officestaff(int mid,String name,String dname)		
	{
		super(mid,name);
		this.dname=dname;
	}
	void display()
	{
		System.out.println("Member id:"+mid);
		System.out.println("Name:"+name);
		System.out.println("Dname:"+dname);
	}
}
class demo
{
	public static void main(String args[])throws Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no of objects:");
		int n=Integer.parseInt(br.readLine());
		officestaff o[]=new officestaff[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Mid:");
			int mid=Integer.parseInt(br.readLine());
			System.out.println("Enter name:");
			String name=br.readLine();
			System.out.println("Enter Dept:");
			String dname=br.readLine();
			o[i]=new officestaff(mid,name,dname);
			staff s=o[i];
			s.display();
		}
		
		
	}
}
