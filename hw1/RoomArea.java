class Room
{

	private float length;
	private float breadth;
	void getData (float a, float b)
	{
		length = a;
		breadth = b;
	}
	float putLength()		{return length;}
		
	float putBreadth()		{return breadth;}
	
}
class RoomArea
{
	public static void main(String args[])
	{
		float area;
		Room room1 = new Room();
		room1.getData(14, 10);
		area = room1.putLength() * room1.putBreadth();
		System.out.println("Area = " + area);
	}
}