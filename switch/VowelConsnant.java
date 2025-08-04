class VowelConsnant{

	public static void main(String[] args) {
		
		char ch='B';
		switch(ch)
		{

			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':

				System.out.println(ch+ " is an Vowel ");
				break;

			default:
				System.out.println(ch+ " is an Constant");
		}
	}
}