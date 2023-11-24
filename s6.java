Slip6_1: Write a program to display the Employee(Empid, Empname, mpdesignation, Empsal) information using toString().

class Emp
{
	 int id,salary;
	 String name;
	 String desig;
	 Emp(int id, String name, int salary ,String desig)
 	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.desig=desig;
 	 }
	 public String toString() // overrides toString() method
 	 {
		 return id+" "+name+" "+salary+" "+desig;
 	 }
	 public static void main(String args[])
 	 {
		 Emp E1=new Emp(111,"Rakesh",50000,"bsc cs");
		 Emp E2=new Emp(112,"Suresh",25000,"msc cs");
		 System.out.println("Employee details: "+E1);
		 System.out.println("Employee details: "+E2); 
	 }
}

Slip6_2: Create an abstract class “order” having members id, description. Create two subclasses “PurchaseOrder” and “Sales Order” having members customer name and Vendor name respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase Order and Sales Order and accept and display details.

import java.io.*;
abstract class order
{
	protected int mid;
	protected String desc;
	abstract void accept()throws Exception;
	abstract void display();
}
class purchaseorder extends order
{
	String cname;
	void accept()throws Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Mid:");
			mid=Integer.parseInt(br.readLine());
			System.out.println("Enter desciption:");
			desc=br.readLine();
			System.out.println("Enter customer name:");
			cname=br.readLine();
	}
	void display()
	{
		System.out.println("Member id:"+mid);
		System.out.println("Description:"+desc);
		System.out.println("Customer name:"+cname);
	}
}
class salesorder extends order
{
	String vname;
	void accept()throws Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Mid:");
			mid=Integer.parseInt(br.readLine());
			System.out.println("Enter desciption:");
			desc=br.readLine();
			System.out.println("Enter vendor name:");
			vname=br.readLine();
	}
	void display()
	{
		System.out.println("Member id:"+mid);
		System.out.println("Description:"+desc);
		System.out.println("Vendor name:"+vname);
	}
}
class demo
{
	public static void main(String args[])throws Exception
	{
		order o;
		purchaseorder p[]=new purchaseorder[3];
		salesorder s[]=new salesorder[3];
		for(int i=0;i<3;i++)
		{			
			p[i]=new purchaseorder();			
			o=p[i];
			o.accept();
			o.display();

			s[i]=new salesorder();			
			o=s[i];
			o.accept();
			o.display();
		}		
	}
}
