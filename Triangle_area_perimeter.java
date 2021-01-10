class Triangle
{
	void perimeter()
	{
		int P=3+4+5;
		System.out.println("Perimeter of a triangle with sides 3,4 and 5 units is " +P);
		
	}
	
	void Area()
	{
		double A=0.5*3*5;
		System.out.println("Area of a triangle with sides 3,4 and 5 units is " +A);
	}
}



public class Triangle_area_perimeter
{

	public static void main(String[] args) 
	{
		Triangle ob= new Triangle();
		ob.perimeter();
		ob.Area();

	}

}

