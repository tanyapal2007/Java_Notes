class OddEvenNumber{

	public static void main(String[] args)
	{
		int count=0,sum=0;
		System.out.println("the number is ");
		for(int i=1;i<=10;i=i+2)
		{
			if(i%2==0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			System.out.println(i);
			count++;
			sum=sum+i;
		}
		System.out.println("Total count =" +count);
		System.out.println("Addition =" +sum);
	}
}