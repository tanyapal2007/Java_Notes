import java.util.Scanner;

class Addition1{
	public static void main(String[] args)
	{
		Scanner addition = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1= addition.nextInt();

		System.out.println("Enter the second number");
		int num2= addition.nextInt();

		int sum=num1 + num2;

		System.out.println("The sum is = " +sum);
	}
}