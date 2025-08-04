class Grandparents{
	void displaygrandparents()
	{
		System.out.println("This is the Grandparents Class");
	}
}
class Parents extends Grandparents{
	void displayparents()
	{
		System.out.println("This is the Parents class");
	}
}
class Child extends Parents{
	void displaychild()
	{
		System.out.println("This is the Child class");
	}
}

class Multilevelinheritance{

	public static void main(String[] args)
	{
		Child c = new Child();
		c.displaygrandparents();
		c.displayparents();
		c.displaychild();
	}
}