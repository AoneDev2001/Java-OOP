import java.io.*;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
      
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter name :");
     String name =sc.nextLine();
     
     
     System.out.print("Enter last name :");
     String lname =sc.nextLine();

     
     System.out.print("Enter gender :");
     String gender =sc.nextLine();

     
     System.out.print("Enter hight :");
     int hight =sc.nextInt();

     
     System.out.print("Enter weight :");
     int weight =sc.nextInt();
     

     System.out.println("Hello."+name+" "+lname+" Your gender is "+gender+". Your height is "+hight+". Your weight is "+weight);



    }
}
