class Nestedifelse{

	public static void main(String[] args)
	{
		int x=10, y=20, z=15;

		if(x>=y)
		{
			if(x>=z)
			{
				System.out.println(z+ "Z is largest");
			}
			System.out.println(x+ "X is largest");
		}
		else
		{
			if(y>=z)
			{
				System.out.println(y+ "Y is the largest"); 
			}
			else
			{
				System.out.println(z+ "Z is the largest");	
			}
			
		}
	}
}