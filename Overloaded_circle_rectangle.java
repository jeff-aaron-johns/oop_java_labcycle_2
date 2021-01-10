import java.util.Scanner;

class areas
{
	void areas(double r)
	{
		double pi=3.142;
	    double Area=pi*Math.pow(r,2);
	    System.out.println("Area of Circle is " +Area+ "sq units");
	}
	
	void areas(double l,double b)
	{
		double Area=l*b;
		System.out.println("Area of Rectangle is " +Area+ "sq units");
	}
	
}

 public class Overloaded_circle_rectangle
 {
 
	public static void main(String[] args) 
    {
		double l,b,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle:");
		r = sc.nextDouble();
		
		
		System.out.println("Enter Length and Breadth of rectangle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		areas ob=new areas();
        ob.areas(r);
        ob.areas(l,b);
	}
 }

