package EncapSulation;
import java.util.Scanner;
public class Laptop
{
   private int pin=2425;
   private String name;
   private double price;
   private int ram;

   Laptop()
   {

   }
   Scanner sc=new Scanner(System.in);
   public void setName(String name)
   {
      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation is Successfull name is:");
         this.name=name;   
      }
      else
      {
         System.out.println("Invalid PIN Enter! Name is not Set!");
      }
   }
   public String getName()
   {
      
      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation Successfull"); 
         return name;  
      }
      else
      {
         System.out.println("Invalid PIN ");
         return null;
      }
      
   }
   public void setPrice(double price)
   {

      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation is Successfull price is:");  
         this.price=price; 
      }
      else
      {
         System.out.println("Invalid PIN Enter! Price is not Set!");
      }  
   }
   public double getPrice()
   {
      
      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation Successfull ");
         return price;  
      }
      else
      {
         System.out.println("Invalid PIN ");
         return 0;
      }
   }
   public void setRam(int ram)
   {
      
      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation is Successfull Ram is:");
         this.ram=ram;   
      }
      else
      {
         System.out.println("Invalid PIN Enter! Ram is not Set!");
      }
   }
   public int getRam()
   {
      
      System.out.println("Enter the PIN: ");
      int pin=sc.nextInt();
      if (this.pin==pin)
      {
         System.out.println("Validation Successfull ");   
         return ram;
      }
      else
      {
         System.out.println("Invalid PIN ");
         return 0;
      }
   }

}