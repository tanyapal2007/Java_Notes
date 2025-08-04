import java.util.*;

class ArrayMatrix{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns");
		int column = sc.nextInt();

		int[][] matrix1 = new int[rows][column];
		int[][] matrix2 = new int[rows][column];
		int[][] sum = new int[rows][column];


		System.out.println("\n Enter the elements of matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Matrix1[" + i + "][" + j + "] =");
				matrix1[i][j] = sc.nextInt(); 
			}
		}

		System.out.println("\n Enter the elements of matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Matrix2[" + i + "][" + j + "] =");
				matrix2[i][j] = sc.nextInt(); 
			}
		}

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix1[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("--------------------------------------------");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix2[i][j]);
			}
			System.out.println("  ");
		}

		System.out.println("--------------------------------------------");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(sum[i][j]);
			}
			System.out.println("  ");
		}
	}
}