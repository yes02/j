Slip26_1: Define a Item class (item_number, item_name, item_price). Define a default 
and parameterized constructor. Keep a count of objects created. Create objects using 
parameterized constructor and display the object count after each object is created.(Use 
static member and method). Also display the contents of each object*/

class Item 
{ 
 int ino; 
 String iname; 
 double iprice; 
 static int count=0; 
 Item() 
 { } 
 Item(int no,String nm,double d) 
 { 
 ino=no; 
 iname=nm; 
 iprice=d; 
 count++; 
 } 
 public void display() 
 { 
 System.out.println("Total objects created "+count); 
 System.out.println(ino+" "+iname+" "+iprice); 
 } 
 public static void main(String args[]) 
 { 
 Item ob1=new Item(1,"Laptop",20000.00); 
 ob1.display(); 
 Item ob2=new Item(1,"Laptop",20000.00); 
 ob2.display(); 
 } 
}

Slip26_2: Define a class ‘Donor’ to store the below mentioned details of a blood donor. name, age, address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects of this class for all the regular donors at Pune. Write these objects to a file. Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.

import java.io.*; 
import java.util.*; 
 
 class Donor 
{ 
 String name, address,group; 
 int age, contact, lod; 
 
 public Donor(String Name,String address, String group,int age,int contact,int lod) 
 { 
 this.name=name; 
 this.address=address; 
 this.group=group; 
 this.age=age; 
 this .contact=contact; 
 this.lod=lod; 
 } 
 
 public static void main(String args[]) 
 { 
 Scanner s=new Scanner(System.in); 
 System.out.println("Enter how many records you want"); 
 int n=s.nextInt(); 
try 
{ 
ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("save.txt")); 
Donor d[]=new Donor[n]; 
for(int i=0;i<n;i++) 
{ 
 System.out.println("Name: "); 
 String name=s.next(); 
 System.out.println("Age: "); 
 int age=s.nextInt(); 
 System.out.println("Address: "); 
 String address=s.next(); 
 System.out.println("Contact: "); 
 String contact=s.next(); 
 System.out.println("Group: "); 
 String group=s.next(); 
 System.out.println("Last donation: "); 
 int lod=s.nextInt(); 
 o.writeObject(d[i]); 
} 
} 
catch(IOException e) 
{ 
System.out.println(e); 
} 
try 
{ 
ObjectInputStream z=new ObjectInputStream(new FileInputStream("save.txt")); 
for(int i=0;i<n;i++) 
{ 
Donor d=(Donor)z.readObject(); 
if(d.group.equals("A+ve")&&d.lod>=6) 
System.out.println(d); 
} 
} 
catch(Exception e) 
{ 
 System.out.println(e); 
} 
} 
}

