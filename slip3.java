//Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.

import java.util.Scanner;
class slip3
{
	 public static void main(String args[])
	 {
		 String temp;
		 Scanner SC = new Scanner(System.in);

		 System.out.print("Enter the value of N: ");
		 int N= SC.nextInt();
		 SC.nextLine(); 

		 String names[] = new String[N];

		 System.out.println("Enter names: ");
		 for(int i=0; i<N; i++)
     		 {
			 System.out.print("Enter name : ");	
			 names[i] = SC.nextLine();
		 }
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
