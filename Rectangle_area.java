
import java.util.Scanner;

class Area
{
	double area;
	
	 void Area(double l,double b)
	{
		 area=l*b;
		
	}
	double returnArea()
	{
		return this.area;
	}
	
}

public class Rectangle_area 
{
   public static void main(String[] args) 
   
   {
	   double l,b,area;
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length and beadth of rectangle :");
		 l =sc.nextDouble();
		 b=sc.nextDouble();
		Area ob =new Area();
		ob.Area(l,b);
		area=ob.returnArea();
		
		System.out.println("Area of a rectangle is " +area);
		
		}

}
