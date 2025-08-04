import java.util.Scanner;

class Divisionuserdefined
{

	public static float div(float num1, float num2)
	{
		float divide = num1/num2;
		return divide;
	}

	public static void main(String[] args)
	{
		Scanner division = new Scanner(System.in);

		System.out.println("Enter the first number");
		float num1 = division.nextFloat();

		System.out.println("Enter the second number");
		float num2 = division.nextFloat();

		float result = div(num1,num2);

		System.out.println("The Division of " +num1+ " / " +num2+ " = " +result);
	}

}