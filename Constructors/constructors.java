class student{
	int id;
	String n;
	student(int i,String name)
	{
		id = i;
		n = name;
	}
	void display()
	{
		System.out.println("Your id is" +id);
		System.out.println("Your name is" +n);
	}
}


class constructors{

	public static void main(String[] args)
	{
		student s1 = new student(5,"Tanya");
		student s2 = new student(6,"Shraddha");
		s1.display();
		s2.display();
	}
}