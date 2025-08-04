class Shape{
	public void display()
	{
		System.out.println("This is a shape");
	}
}
class Circle extends Shape{
	public void drawcircle()
	{
		System.out.println("Draw a circle");
	}
}
class Square extends Shape{
	public void drawsquare()
	{
		System.out.println("Draw a Square");
	}
}
class Triangle extends Shape{
	public void drawtriangle()
	{
		System.out.println("Draw a Triangle");
	}
}
class Rectangle extends Shape{
	public void drawrectangle()
	{
		System.out.println("Draw a Rectangle");
	}
}

class Herarchicalinheritance{

	public static void main(String[] args)
	{
		Circle c = new Circle();
		Square s = new Square();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();

		c.display();
		c.drawcircle();

		s.display();
		s.drawsquare();

		t.display();
		t.drawtriangle();

		r.display();
		r.drawrectangle();
	}
}