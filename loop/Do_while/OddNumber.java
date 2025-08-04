class OddNumber{

	public static void main(String[] args)
	{
		int count=0,sum=0;
		System.out.println("Enter the number");
		int i=1;
		do 
		{
			System.out.println(i);
			count++;
			sum=sum+i;
			i=i+2;
		}while(i<=10);
		System.out.println("Total Count = " +count);
		System.out.println("Addition = " +sum);
	}
}