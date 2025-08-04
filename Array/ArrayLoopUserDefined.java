import java.util.Scanner;

class ArrarLoopUserDefined{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Elements");
		int size = sc.nextInt();
		int i;
		int[] age = new int[size];

		System.out.println("Enter" + size + "age values");
		for(i=0;i<size;i++)
		{
			System.out.println("Enter age" + (i + 1) + ":");
			age[i] = sc.nextInt();
		}
		System.out.println("\n Using Loop");
		for(i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
	}
}