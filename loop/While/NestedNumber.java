class NestedNumber{

	public static void main(String[] args)
	{
		int k=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(k+ " ");
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}