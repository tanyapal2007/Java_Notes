import java.util.Scanner;

class Ladderifuserdefined{
	public static void main(String[] args)
	{
		Scanner ladderif = new Scanner(System.in);

		System.out.println("Enter the Percentage");
		float percentage = ladderif.nextFloat();

		if(percentage >= 90)
		{
			System.out.println("Grade A");
		}
		else if(percentage >=80)
		{
			System.out.println("Grade B");
		}
		else if(percentage >=70)
		{
			System.out.println("Grade C");
		}
		else if(percentage >=60)
		{
			System.out.println("Grade D");
		}
		else if(percentage >=50)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("you are fail");
		}
	}
}