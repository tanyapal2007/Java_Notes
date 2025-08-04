class TestProject{

	public static void main(String[] args)
	{
		int sum=0;

		for(int i=0;i<=5;i++)
		{
			sum+=i;
		}
		if(sum>10)
		{
			System.out.println("Number is greater than 10 " +sum);
		}
		else
		{
			System.out.println("Number is less than 10 " +sum);
		}
	}
}