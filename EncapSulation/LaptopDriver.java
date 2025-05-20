package EncapSulation;
public class LaptopDriver
{
    public static void main(String[] args)
    {
       Laptop l1=new Laptop();
       l1.setName("Lenovo");
       l1.setPrice(53200.5);
       l1.setRam(16);
       System.out.println("Name is:"+l1.getName());
       System.out.println("Price is:"+l1.getPrice());
       System.out.println("Ram is:"+l1.getRam());
       
    }    
}