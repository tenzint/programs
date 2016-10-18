class Animal
{
	int _x;
	Animal(int x)	{_x=x;}
	public void move()
	{
		System.out.println("Animals can move");
	}
}

class Dog extends Animal
{
	int _x,_y;
	Dog(int x, int y)
	{
		super(x);
		_y=y;
	}
	public void move()
	{
		System.out.println("Dogs can walk and run");
	}
	int getY()
	{
		return _y;
	}
	void print() {}
}

public class TestDog
{
	public static void main(String args[])
	{
		Animal a = new Animal(2);			// Animal reference and object
		Animal b = new Dog(3,6);				// Animal reference but Dog object
		
		a.move();		//runs the method in Animal class
		
		b.move();		// runs the method in Dog class
		//int y = b.getY();								// accessing child's method with parent's reference gives error
		// System.out.println ("\n y: " + y);			// (even if object is child)
		// b.print();
	}
}