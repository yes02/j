Slip29_1: Write a program to create a class Customer(custno,custname,contactnumber,custaddr). Write a method to search the customer name with given contact number and display the details

import java.util.Scanner; 
 class Customer 
 { 
 int cno; 
 String cname,cmob,cadd; 
 
 public static void main(String [] args) 
 { 
 int i=0; 
 { 
 
 Scanner sc = new Scanner(System.in); 
 Customer ob[]=new Customer[5]; 
 
 for(i=0;i<2;i++) 
 { 
 System.out.println("Enter cno,cname,cmob,cadd"); 
 ob[i]=new Customer(); 
 ob[i].cno=sc.nextInt(); 
 ob[i].cname=sc.next(); 
 ob[i].cmob=sc.next(); 
 ob[i].cadd=sc.next(); 
 } 
 String mb=""; 
 System.out.print("enter mob to search"); 
 mb=sc.next(); 
 for(i=0;i<2;i++) 
 { 
 if(mb.equals(ob[i].cmob))
 { 
 System.out.println("Name"+ob[i].cname); 
 }  
 } 
 } 
 } 
 }

Slip29_2: Write a program to create a super class Vehicle having members Company and price. Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle (capacity_in_tons). Accept the information for "n" vehicles and display the information in appropriate form. While taking data, ask user about the type of vehicle first.

import java.io.*; 
class Vehicle 
 { 
 String company; 
 double price; 
 public void accept() throws IOException 
 { 
 System.out.println("Enter the Company and price of the Vehicle: "); 
 BufferedReader br=new BufferedReader(new 
InputStreamReader(System.in)); 
 company=br.readLine(); 
 price=Double.parseDouble(br.readLine()); 
 
 } 
 public void display() 
 { 
 System.out.println("Company: "+company+" Price: "+price); 
 } 
 
 } 
class LightMotorVehicle extends Vehicle 
 { 
 double mileage; 
 public void accept() throws IOException 
 { 
 super.accept(); 
 System.out.println("Enter the mileage of the vehicle: "); 
 BufferedReader br=new BufferedReader(new 
InputStreamReader(System.in)); 
 mileage=Double.parseDouble(br.readLine()); 
 } 
 public void display() 
 { 
 super.display(); 
 System.out.println("Mileage: "+mileage); 
 } 
 } 
 class HeavyMotorVehicle extends Vehicle 
 { 
 double captons; 
 public void accept() throws IOException 
 { 
 super.accept(); 
 System.out.println("Enter the capacity of vehicle in tons: ");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 captons=Double.parseDouble(br.readLine()); 
 } 
 public void display() 
 { 
 super.display(); 
 System.out.println("Capacity in tons: "+captons); 
 } 
} 
class demo 
{ 
 public static void main(String [] args) throws IOException 
 { 
 int i; 
 System.out.println("Enter the type of vehicle: "); 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 System.out.println("1.Light Vehicle"); 
 System.out.println("2.Heavy Vehicle"); 
 int ch=Integer.parseInt(br.readLine()); 
 switch(ch) 
 { 
 case 1: 
 System.out.println("Enter the number of Light vehicles: ");
 int n=Integer.parseInt(br.readLine()); 
 LightMotorVehicle [] l=new LightMotorVehicle[n]; 
 for(i=0;i<n;i++) 
 { 
 l[i]=new LightMotorVehicle(); 
 l[i].accept(); 
 } 
 for(i=0;i<n;i++) 
 { 
 l[i].display(); 
 } 
 break; 
 case 2: 
 System.out.println("Enter the number of Heavy vehicles:"); 
 int m=Integer.parseInt(br.readLine()); 
 HeavyMotorVehicle [] h=new HeavyMotorVehicle[m]; 
 for(i=0;i<m;i++) 
 { 
 h[i]=new HeavyMotorVehicle(); 
 h[i].accept(); 
 } 
 for(i=0;i<m;i++){ 
 h[i].display(); 
 } 
 break; 
 } 
 } 
}

