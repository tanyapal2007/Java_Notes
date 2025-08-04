import java.util.Scanner;

class Division1{
	public static void main(String[] args)
	{
		Scanner division = new Scanner(System.in);

		System.out.println("Enter the first number");
		float num1 = division.nextFloat();

		System.out.println("Enter the second number");
		float num2 = division.nextFloat();

		float div=num1/num2;
		System.out.println(" The Division is = " +div);
		
	}
}