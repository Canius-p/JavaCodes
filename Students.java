import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class Students {

 public static void main(String[] args) {

  try
  {
   File f=new File("./data/stud.dat");
   FileOutputStream fos=new FileOutputStream(f);
   DataOutputStream dos=new DataOutputStream(fos);
   
   Scanner s=new Scanner(System.in);
   String Name,Address;
   
   System.out.println("Enter the data for ten students : ");
   for(int i=1;i<=10;i++)
   {
    System.out.println("Enter Name and Adress=>");
    Name = s.nextLine();
    Address = s.nextLine();
    
    
    dos.writeUTF(Name);
dos.writeUTF(Address) ;
  }
   
   System.out.println("Record saved successfully...");
   dos.close();
  }
  catch(Exception ee){
   System.out.println(ee.getMessage());
   ee.printStackTrace();
  }
 }
}