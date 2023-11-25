Slip15_1: Accept the names of two files and copy the contents of the first to the second. First file having Book name and Author name in file.

import java.io.*; 
import java.util.*; 
 
class demo
{ 
 public static void main(String args[]) throws Exception 
 { 
 Scanner sc= new Scanner(System.in); 
 System.out.println("Enter the first file"); 
 String f1=sc.next(); 
 System.out.println("Enter the second file"); 
 String f2=sc.next(); 
 
 FileInputStream fis=new FileInputStream(f1); 
 FileOutputStream fos=new FileOutputStream(f2); 
 int ch; 
 while((ch=fis.read())!=-1) 
 { 
 fos.write(ch); 
 } 
 System.out.println("file copied..."); 
 fis.close(); 
 fos.close(); 
 } 
 }

Slip 15-2:
Write a program to define a class Account having members custname, accno. Define default and parameterized constructor. Create a subclass called SavingAccount with member savingbal, minbal. Create a derived class AccountDetail that extends the class SavingAccount with members, depositamt and withdrawalamt. Write a appropriate method to display customer details

class account
{
	int accno;
	String cname;
	account()
	{
		this.accno=0;
		this.cname="";
	}
	account(int accno,String cname)
	{
		this.accno=accno;
		this.cname=cname;
	}
	
}
class saving extends account
{
	double savingbal,minbal;
	saving()
	{
		this.savingbal=0;
		this.minbal=0;
	}
	saving(String cname,int accno,double savingbal,double minbal)
	{
		super(accno,cname);
		this.savingbal=savingbal;
		this.minbal=minbal;
	}
}
class accountdetails extends saving
{
	double depositeamt,withdrawamt;
	accountdetails()
	{
		this.depositeamt=0;
		this.withdrawamt=0;
	}
	accountdetails(String cname,int accno,double savingbal,double minbal,double depositeamt,double withdrawamt)
	{
		super(cname,accno,savingbal,minbal);
		this.depositeamt=depositeamt;
		this.withdrawamt=withdrawamt;
	}
	void display()
	{
		System.out.println("account no:"+accno);
		System.out.println("cname:"+cname);
		System.out.println("Saving bal:"+savingbal);
		System.out.println("Minimum bal:"+minbal);
		System.out.println("Deposite amt:"+depositeamt);
		System.out.println("withdraw amt:"+withdrawamt);
		
	}
}
class demo
{
	public static void main(String args[])throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter customar name:");
	String cname=br.readLine();
	System.out.println("Enter account no:");
	int accno=Integer.parseInt(br.readLine());
	
	System.out.println("Enter saving balance:");
	double savingbal=Double.parseDouble(br.readLine());

	System.out.println("Enter minimum balance:");
	double minbal=Double.parseDouble(br.readLine());
		
	System.out.println("Enter deposite amount:");
	double depositeamt=Double.parseDouble(br.readLine());

	System.out.println("Enter Withdraw amount:");
	double withamt=Double.parseDouble(br.readLine());

	accountdetails a=new accountdetails(cname,accno,savingbal,minbal,depositeamt,withamt);
	a.display();
	}
}

