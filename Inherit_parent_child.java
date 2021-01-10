class main
{
	void parent()
	{
		System.out.println("This is parent class");
		
	}
}

class sub extends main
{
	void child()
	{
		System.out.println("This is child class");
	}
}


public class Inherit_parent_child
{

	public static void main(String[] args)
	{
		main ob1= new main();
		sub ob2=new sub();
		sub ob3=new sub();
		
        ob1.parent();
        ob2.child();
        ob3.parent();
	}

}
