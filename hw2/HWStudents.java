class Student
{
	static int count = 0;
	private int _ID;
	String _name;
	
	Student()
	{
		count++;
	}
	Student(int ID, String name)
	{
		count++;
		_ID = ID;
		_name = name;
	}
	void setID(int ID)
	{
		_ID = ID;
	}
}

class HWStudents
{
	public static void main (String args[])
	{
		System.out.println("Student count: " + Student.count);
		Student Tenzin = new Student();
		Tenzin.setID(888);
		Tenzin._name = "Tenzin";
		
		System.out.println("Updated student count: " + Student.count);
		Student Venkat = new Student(555, "Venkatrama");
		
		System.out.println("Updated student count: " + Student.count);
		
	}
}