class EvenNo{

	public static void main(String[] args)
	{
		int count=0,sum=0;
		System.out.println("The number is");
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			count++;
			sum=sum+i;
			i=i+2;
			
		}
		System.out.println("Total Count = " +count);
		System.out.println("Addition of even No = " +sum);
	}
}