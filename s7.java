Slip7_1: Design a class for Bank. Bank Class should support following operations; a. Deposit a certain amount into an account b. Withdraw a certain amount from an account c. Return a Balance value specifying the amount with details.

class bank
{
	private double balance;
	public bank()
	{
		balance = 0;
	}
	public bank(double initialBalance)
	{
		balance = initialBalance;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args)
	{
		bank b = new bank(1000);
		b.withdraw(250);
		System.out.println("the withdraw is:"+ b.balance);
		b.deposit(400);
		System.out.println("the deposit is:"+ b.balance);
		System.out.println("the balance is:"+ b.getBalance());
	}	 
}
Slip7_2: Write a program to accept a text file from user and display the contents of a file in reverse order and change its case.

import java.io.*;
import java.util.*;
class reversefile
{
   public static void main(String args[])throws IOException
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter file name:");
	 String fnm = sc.next();
	 File f = new File(fnm);
	 if(f.isFile())
	 {
BufferedInputStream bis = new BufferedInputStream(new
FileInputStream(fnm));
		 int size =bis.available();
		 for(int i = size-1;i>=0;i--)
		 {
			 bis.mark(i);
			 bis.skip(i);
			 char ch=((char)bis.read());
			 if(Character.isLowerCase(ch))
				 ch=Character.toUpperCase(ch);
			 else if(Character.isUpperCase(ch))
				 ch = Character.toLowerCase(ch);
			 System.out.print(ch);
			 bis.reset();
		 }
 		bis.close();
 	}
 	else
 		System.out.println("file not found");
     }
}
