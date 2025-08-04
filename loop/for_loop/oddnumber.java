class oddnumber{

	public static void main(String[] args)
	{
		int count=0,sum=0;
		System.out.println("Odd table is");
		for(int i=1;i<=10;i=i+2)
		{
			
			System.out.println(i);
			sum=sum+i;
			count++;
		}
		System.out.println("Total odd number =" +count );
		System.out.println("addition of odd number =" +sum );

	}
}