class Room				// parent or super class
{
	int length;
	int breadth;
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	int area()
	{
		return (length*breadth);
	}
}
class DiningRoom extends Room 
{
	int height;
	DiningRoom(int x, int y, int z)
	{
		super(x,y);
		height=z;
	}
	int volume()
	{
		return(area()*height);
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		DiningRoom room1 = new DiningRoom(14, 12, 10);
		int area1 = room1.area();
		int volume1 = room1.volume();
		System.out.println("Area 1:\t" +area1);
		System.out.println("Volume 1:\t" +volume1);
	}
}