import java.util.Scanner;

class Switchuserdefined{

	public static void main(String[] args)
	{
		Scanner switchuser = new Scanner(System.in);

		System.out.println("Enter the Week");
		char Week = switchuser.next().charAt(0);

		switch(Week)
		{
			case 'A':
				System.out.println("Sunday");
				break;
			case 'B':
				System.out.println("Monday");
				break;
			case 'C':
				System.out.println("Tuesday");
				break;
			case 'D':
				System.out.println("Wednesday");
				break;
			case 'E':
				System.out.println("Thursday");
				break;
			case 'F':
				System.out.println("Friday");
				break;
			case 'G':
				System.out.println("Saturday");
				break;
		}
	}
}