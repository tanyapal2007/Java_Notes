class NestedNumber{

	public static void main(String[] args)
	{
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(k+ " ");
				k++;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}