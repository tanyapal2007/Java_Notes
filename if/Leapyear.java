import java.util.Scanner;

class Leapyear{

	public static void main(String[] args)
	{
		Scanner leap = new Scanner(System.in);

		System.out.println("Enter the year");
		int year = leap.nextInt();

		if(year%400==0)
		{
			System.out.println(year+ "This is a leap year");
		}
		else if(year%100==0)
		{
			System.out.println(year+ "This is not a leap year");
		}
		else if(year%4==0)
		{
			System.out.println(year+ "This is a leap year");
		}
		else
		{
			System.out.println(year+ "This is not a leap year");
		}
	}
}