package assignment;

abstract class shape
{
	abstract void numberOfSides();
}
class Hexagon extends shape
{private int n=6;
	void numberOfSides()
	{
		System.out.println("no. of sides of hexagon = "+n);
	}
}
class Triangle extends shape
{private int n=3;
	void numberOfSides()
	{
		System.out.println("no. of sides of hexagon = "+n);
	}
}
class Trapezoid extends shape
{private int n=4;
	void numberOfSides()
	{
		System.out.println("no. of sides of hexagon = "+n);
	}
}

public class abstactClass{
public static void main(String as[])
{
	shape obj=new Hexagon();
	obj.numberOfSides();
	obj=new Triangle();
	obj.numberOfSides();
	obj=new Trapezoid();
	obj.numberOfSides();
}

}
