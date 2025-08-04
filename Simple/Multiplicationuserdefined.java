import java.util.Scanner;

	
class Multiplicationuserdefined{

	public static int mul(int num1,int num2)
	{
		int multiply = num1*num2;
		return multiply;
	}

	public static void main(String[] args)
	{
		Scanner multiplication = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = multiplication.nextInt();

		System.out.println("Enter the second number");
		int num2 = multiplication.nextInt();

		int result = mul(num1,num2);

		System.out.println("The multiplication of " +num1+ " * " +num2+ " = " +result);

	}
}