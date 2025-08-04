import java.util.Scanner;

class Subtractionuserdefined{

	public static int sub(int num1, int num2)
	{
		int subtract = num1-num2;
		return subtract;
	}

	public static void main(String[] args)
	{
		Scanner subtraction = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = subtraction.nextInt();

		System.out.println("Enter the second number");
		int num2 = subtraction.nextInt();

		int result = sub(num1, num2);

		System.out.println("The Subtraction is " +num1+ "-" +num2+ "=" +result);
	}
}