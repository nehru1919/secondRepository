import java.util.Scanner;
import p1.Empsalary;
class Empmainclass
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter bsal:");
double bsal=s.nextDouble;
String name;
String idno;
System.out.println("=== Employee salary is===");
Empsalary obj=new Empsalary();
obj.totalsalary(float bsal);
obj.getdetails(name,idno);
}
}
