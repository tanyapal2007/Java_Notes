import java.util.*;

class Array2Value{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		int[] array1 = new int[size];
		int[] array2 = new int[size];
		int[] sumArray = new int[size];

		System.out.println("\n Enter the elements of first array");
		for(int i=0;i<size;i++)
		{
			System.out.println("Elements" + (i + 1) + ":");
			array1[i] = sc.nextInt();
		}

		System.out.println("\n Enter the elements of second array");
		for(int i=0;i<size;i++)
		{
			System.out.println("Elements" + (i + 1) + ":");
			array2[i] = sc.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			sumArray[i] = array1[i]+array2[i];
		}

		System.out.println("\n First Array");
		for(int value : array1)
		{
			System.out.println(value + " ");
		}

		System.out.println("\n Second Array");
		for(int value : array2)
		{
			System.out.println(value + " ");
		}

		System.out.println("\n Sum Array");
		for(int value : sumArray)
		{
			System.out.println(value + " ");
		}
	}
}