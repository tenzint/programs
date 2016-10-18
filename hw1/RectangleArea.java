// Constructor
class Rectangle
{
	private int length, width;
	Rectangle (int x, int y)
	{
		length = x;
		width = y;
	}
	Rectangle (int x)
	{
		length = width = x;
	}
	int rectArea()
	{
		return (length * width);
	}
}

class RectangleArea
{
	public static void main (String args[])
	{
		Rectangle rect1 = new Rectangle(15, 10);
		Rectangle rect2 = new Rectangle(20);
		int area1 = rect1.rectArea();
		int area2 = rect2.rectArea();
		System.out.println("Area1 = " + area1);
		System.out.println("Area2 = " + area2);
	}
}