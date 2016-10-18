class Student
{
	static int ID_creator = 1;
	int _id;
	String _name;
	Student(String name)
	{
		_id=ID_creator;
		ID_creator++;
		_name = name;
	}
	void print()
	{
		System.out.printf("ID: %-10d Name: %1s%n", _id, _name);
	}
}
class HWObjectArray
{
	public static void main(String args[])
	{
		Student stuArray[] = new Student[10];
		for(int i=0; i<10; i++)
		{
			stuArray[i] = new Student("Tenzin" +i);
			stuArray[i].print();
		}
		
		
	}
}
		