class ArraySumAverage{

	public static void main(String[] args) {
		int numbers[] = {-3,-2,-1,0,1,2,3,4,5,6,7,8,9};
		int sum=0;
		double average;

		for(int number:numbers)
		{
			sum += number;
		}
		int arraylength = numbers.length;

		average = ((double)sum / (double)arraylength);
		System.out.println("Sum = " +sum);
		System.out.println("Average = " +average);
	}

}