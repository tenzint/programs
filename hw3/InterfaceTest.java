interface Area
{
	final static float pi = 3.14f;
	float compute(float x, float y);
}
interface Volume
{
	float compute(float x, float y, float z);
}
class Rectangle implements Area, Volume
{
	public float compute (float x, float y)
	{
		return(x*y);
	}
	public float compute (float x, float y, float z)
	{
		return(x*y*z);
	}
	
}
class Circle implements Area
{
	public float compute (float x, float y)
	{
		return(pi*x*x);
	}
}
class InterfaceTest
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Area area;
		
		area = rect;
		System.out.println("Area of Rectangle = " + area.compute(10,20));
		System.out.println("Area of Rectangle = " + rect.compute(10,20, 10));
		
		area = cir;
		System.out.println("Area of Circle = " + area.compute(10,10));
	}
}