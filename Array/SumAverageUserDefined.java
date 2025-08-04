import java.util.Scanner;

class SumAverageUserDefined{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int size = sc.nextInt();

		int[] numbers = new int[size];
		
		System.out.println("Enter" + size + "numbers");
		for(int i=0;i<size;i++)
		{
			System.out.println("Elements" + (i+1) + " : ");
			numbers[i] = sc.nextInt();
		}
		int sum=0;
		for(int number:numbers)
		{
			sum += number;
		}
		double average = (double)sum/size;

		System.out.println("Sum = " +sum);
		System.out.println("Average = " +average);
	}
}