class Switch{
	public static void main(String[] args)
	{
		char grade = 'A';

		switch(grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
		case 'C':
			System.out.println("Well Done");
			break;

		case 'D':
			System.out.println("Pass");
			break;

		case 'E':
			System.out.println("Try Again");
			break;
		}
	}
}