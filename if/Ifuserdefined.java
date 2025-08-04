import java.util.Scanner;

class Ifuserdefined{

	public static void main(String[] args)
	{
		Scanner ifuser = new Scanner(System.in);

		System.out.println("Enter the age");
		int age = ifuser.nextInt();

		if(age >= 18)
		{
			System.out.println("You are a adult");
		}
		else
		{
			System.out.println("You are child");
		}
	}
}