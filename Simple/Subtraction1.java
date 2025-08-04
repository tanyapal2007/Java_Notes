import java.util.Scanner;

class Subtraction1{
	public static void main(String[] args)
	{
		Scanner subtraction = new Scanner(System.in);

		System.out.println("Enter the First number");
		int num1 = subtraction.nextInt();

		System.out.println("Enter the second number");
		int num2 = subtraction.nextInt();

		int sub=num1-num2;

		System.out.println("The subtraction is = " +sub);
	}
}