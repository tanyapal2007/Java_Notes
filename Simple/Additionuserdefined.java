import java.util.Scanner;

class Additionuserdefined{

	public static int add(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner addition = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = addition.nextInt();

		System.out.println("Enter the second number");
		int num2 = addition.nextInt();

		int result = add(num1,num2);

		System.out.println("The sum of" +num1+ "+" +num2+ "=" +result);
	}
}