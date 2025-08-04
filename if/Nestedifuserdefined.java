import java.util.Scanner;

class Nestedifuserdefined{

	public static void main(String[] args)
	{
		Scanner nested = new Scanner(System.in);

		System.out.println("Enter the Student's GPA");
		double gpa = nested.nextDouble();

		System.out.println("Enter the Students's attendence percentage");
		double percentage = nested.nextDouble();

		if(gpa >=3.5)
		{
			if( percentage >= 90)
				
			{
				System.out.println("Student is eligible for full scholarship");
			}
			else
			{
				System.out.println("Student is eligible for partial scholarship");
			}
		}
		else
		{
			if(gpa >= 3.0)
			{
				System.out.println("Student is eligible for merit-based scholarship");
			}
			else
			{
				System.out.println("Student is not eligible for scholarship");
			}
		}
	}
}