import java.util.Scanner;

class Multiplication1{
	public static void main(String[] args)
	{
		Scanner multiplication = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = multiplication.nextInt();

		System.out.println("Enter the second number");
		int num2 = multiplication.nextInt();

		int mul=num1*num2;

		System.out.println("The multiplication is = " +mul);
	}
}