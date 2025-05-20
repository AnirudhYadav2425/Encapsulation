package EncapSulation;
import java.util.Scanner;
public class Employ
{
    private int pin=2425;
    private String name;
    private int age;
    private double salary; 
    
    Employ()
    {

    }

    Scanner sc=new Scanner(System.in);


    public void setName(String name)
    {
        System.out.println("Enter the PIN: ");
        int pin=sc.nextInt();
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Name is Set:");
            this.name=name;
        }
        else
        {
            System.out.println("Invalid PIN Name is not set:");
        }
    }
    public String getName()
    {
        System.out.println("Enter the PIN: ");
        int pin=sc.nextInt();
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Name is:");
            return name;
        }
        else
        {
            System.out.println("Invalid PIN:");
            return null;
        }
    }
    public void setAge(int age)
    {
        System.out.println("Enter the PIN: ");
        int pin=sc.nextInt();
    
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Age is:");
        }
        else
        {
            System.out.println("Invalid PIN Age is");
        }
    }
    public int getAge()
    {
        System.out.println("Enter the PIN:");
        int pin=sc.nextInt();
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Age is:");
            return age;
        }
        else
        {
            System.out.println("Invalid PIN Age is:");
            return 0;
        }
    }
    public void setSalary(double salary)
    {
        System.out.println("Enter the PIN: ");
        int pin=sc.nextInt();
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Salary is:");
        }
        else
        {
            System.out.println("Invalid PIN Salary is:");
        }
    }
    public double getSalary()
    {
        
        System.out.println("Enter the PIN: ");
        int pin=sc.nextInt();
        if(this.pin==pin)
        {
            System.out.println("Validation Successfull Salary is:");
            return salary;
        }
        else
        {
            System.out.println("Invalid PIN Salary is");
            return 0.0;
        }
    }
}
