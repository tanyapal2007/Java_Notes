class evennumber{

	public static void main(String[] args)
	{
		int count=0,sum=0;
		System.out.println("Even table is");
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
			count++;
			sum=sum+i;
		}
		System.out.println("Total even number =" +count);
		System.out.println("Addition of even number =" +sum);
	}
}