import java.util.*;

class VowelConsnantUserDefined{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the alphabet character");
		String ch = sc.nextLine();

		switch(ch)
		{
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":

			System.out.println( ch + " is an vowel ");
			break;

		default:

			System.out.println( ch + " is a Consonant");
			break;
		}
	}
}