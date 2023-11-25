Slip27_1: Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, which will return salary of manager by adding traveling allowance, house rent allowance etc.

import java.util.*; 
class Employee 
{ 
 int BasicSalary=35000; 
 public void getSalary() 
 { 
 System.out.println("Employee Salary:"+BasicSalary); 
 } 
} 
class Manager extends Employee 
{ 
 int traveling =2000; 
 int rent =5000; 
 
 public void getSalary() 
 { 
 
 System.out.println("Manager Salary:"+(BasicSalary+traveling+rent)); 
 System.out.println("Basic Salary:"+BasicSalary); 
 System.out.println("Travaling Allowance:"+traveling); 
 System.out.println("House rent:"+rent); 
 
 } 
 public static void main(String[] args) 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Press 1 for Employee Salary and 0 for Manager"); 
 int ch=sc.nextInt(); 
 if(ch==1) 
 { 
 Employee Eob=new Employee(); 
 Eob.getSalary(); 
 } 
 else if(ch == 0) 
 { 
 Manager Mob=new Manager(); 
 Mob.getSalary(); 
 } 
 else 
 System.out.println("Entered Wrong Choice"); 
 
 } 
}

Slip27_2: Write a program to accept a string as command line argument and check whether it is a file or directory. Also perform operations as follows: i)If it is a directory,delete all text files in that directory. Confirm delete operation from user before deleting text files. Also, display a count showing the number of files deleted, if any, from the directory. ii)If it is a file display various details of that file.

import java.io.*;
class demo
{
	public static void main (String[] args) throws IOException
	{
		String fname=args[0];
		File f=new File(fname);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans;
		if(f.isDirectory())
		{
			System.out.println(fname+" is a Directory");
			String list[]=f.list();
			for(int i=0;i<list.length;i++)
			{
				System.out.println(list[i]);
			}
			System.out.println("Number of files:"+list.length);
			for(int i=0;i<list.length;i++)
			{
				if(list[i].endsWith(".txt"))
				{
					File f2=new File(fname+"/"+list[i]);
				System.out.println("Are u sure u want to delete file?? yes or no");
					ans=br.readLine();
					if(ans.equals("yes"))						
					{
						f2.delete();
						System.out.println("File deleted.."+list[i]);
					}
				}
			}
		}
		if(f.isFile())
		{
			System.out.println(fname+" is a File");
			System.out.println("Path="+f.getAbsolutePath());
			System.out.println("size="+f.length());			
		}
	}
}

