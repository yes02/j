Slip21_1: Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject. Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date is invalid.

import java.util.*; 
class InvalidDateException extends Exception 
{ 
} 
class demo 
{ 
 int day,month,year; 
 public void accept() 
 { 
 System.out.println("Enter Date, Month and Year"); 
 try 
 { 
 Scanner sc=new Scanner(System.in); 
 
 day=sc.nextInt(); 
 if(day<1 || day>31) 
 throw new InvalidDateException(); 
 month=sc.nextInt(); 
 if(month>12 ||month<1) 
 throw new InvalidDateException(); 
 year=sc.nextInt(); 
 if(year>10000 ||year<1000) 
 throw new InvalidDateException(); 
 } 
 catch(InvalidDateException e) 
 { 
  System.out.println("Invalid Date entered"); 
 System.exit(0); 
 } 
 catch(Exception e) 
 { 
 System.out.println("Enter Valid Date"); 
 System.exit(0); 
 } 
 } 
 public void display() 
 { 
 System.out.println("Entered Date is "+day+":"+month+":"+year); 
 } 
 public static void main(String args[]) 
 { 
 demo ob=new demo(); 
 ob.accept(); 
 ob.display(); 
 } 
}

Slip21_2: Create an employee class(id,name,deptname,salary). Define a default and 
parameterized constructor. Use ‘this’ keyword to initialize instance variables. Keep a 
count of objects created. Create objects using parameterized constructor and display the 
object count after each object is created. (Use static member and method). Also display 
the contents of each object.

class Employee 
{ 
 int id; 
 String name,deptname; 
 double sal; 
 static int cnt=0; 
 Employee() 
 { 
 cnt++; 
 displayCount(); 
 } 
 Employee(int id,String name,String deptname,double sal) 
 { 
 this.id=id; 
 this.name=name; 
 this.deptname=deptname; 
 this.sal=sal; 
 cnt++; 
 displayCount(); 
 } 
 public static void displayCount() 
 { 
  System.out.println("Total Objects created "+cnt); 
 } 
 public void displayData() 
 { 
 System.out.println(this.id+"\t\t"+this.name+"\t\t\t"+this.deptname+"\t\t"+this.
sal); 
 
 } 
 public static void main(String args[]) 
 { 
 Employee e1=new Employee(101,"Maithili","HR",120020.20); 
 
 Employee e2=new Employee(102,"Soham","IT",140020.20); 
 Employee e3=new Employee(104,"Akshay","Accounts",100020.20); 
 System.out.println("EID\t\tName\t\t\tDepartment\t\tSalary"); 
 e1.displayData(); 
 e2.displayData(); 
 e3.displayData(); 
 } 
}
