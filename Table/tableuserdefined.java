import java.util.Scanner;

class tableuserdefined{

	public static void main(String[] args)
	{
		Scanner table = new Scanner(System.in);

		System.out.println("Enter a number");
		int num1 = table.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(num1 + "*" +i+ " = " +(num1*i));
		}
	}
}