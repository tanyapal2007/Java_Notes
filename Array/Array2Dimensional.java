class Array2Dimensional{

	public static void main(String[] args)
	{
		int[][] matrix;
		String[][] names;

		matrix = new int[3][4];
		int[][] numbers = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int value = matrix[0][1];
		matrix[2][0]=10;

		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.println(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}