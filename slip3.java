Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.

import java.util.Scanner;
class demo
{
	 public static void main(String args[])
	 {
		 String temp;
		 Scanner SC = new Scanner(System.in);

		 System.out.print("Enter the value of N: ");
		 int N= SC.nextInt();
		 SC.nextLine(); //ignore next line character

		 String names[] = new String[N];

		 System.out.println("Enter names: ");
		 for(int i=0; i<N; i++)
     		 {
		 System.out.print("Enter name [ " + (i+1) +" ]: ");	
		 names[i] = SC.nextLine();
		 }

		 //sorting strings

		 for(int i=0; i<N; i++)
 		 {
		    for(int j=1; j<N; j++)
 		    {
			 if(names[j-1].compareTo(names[j])>0)
 			{
				 temp=names[j-1];
				 names[j-1]=names[j];
				 names[j]=temp;
 			}
 		     }
 		  }
 System.out.println("\nSorted names are in Ascending Order: ");
		 for(int i=0;i<N;i++)
		 {
			 System.out.println(names[i]);
  		 }
	}
}

Slip 3-2
Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle appropriate exception while patient oxygen level less than 95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and Need to Hospitalized” otherwise display its information.

import java.io.*;
class checkoxygenhrct extends Exception
{
	checkoxygenhrct(String msg)
	{
		super(msg);
	}
}

class patient
{
	String patient_name;
	int patient_age, patient_oxy_level,patient_hrct;


	public static void main(String args[])throws Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	  System.out.println("Enter patient name:");
         String patient_name=br.readLine();
			
         System.out.println("Enter Age:");
	 int patient_age=Integer.parseInt(br.readLine());
			
         System.out.println("Enter Oxyegen Level:");
	 int patient_oxy_level=Integer.parseInt(br.readLine());

         System.out.println("Enter HRCT:");
	 int patient_hrct=Integer.parseInt(br.readLine());

	try
	{
		if(patient_oxy_level<95 && patient_hrct>10)	
throw new checkoxygenhrct("Patient is Covid Positive(+) and Need to Hospitalized");
		else
			System.out.println("PAtient is Fine");
	}
	catch(checkoxygenhrct e)
	{
		 System.out.println("Alert:"+e.getMessage());
	}	
    }			
}
