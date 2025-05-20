package EncapSulation;

public class EmployDriver
{
    public static void main(String[] args)
    {
        Employ e1=new Employ();
        e1.setName("Anirudh Yadav");
        e1.setAge(22);
        e1.setSalary(45654654.65);
        System.out.println("Name is:"+e1.getName());
        System.out.println("Age is:"+e1.getAge());
        System.out.println("Salary is:"+e1.getSalary());
        
    }
}