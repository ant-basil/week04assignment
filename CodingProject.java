package week04;

public class CodingProject {

	public static void main(String[] args) {
		//1.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int first = ages[0];
		int last = ages[ages.length - 1];
		System.out.println(first - last);
		
		int[] ages2 = new int[9];
		int first2 = ages2[0];
		int last2 = ages2[ages2.length - 1];
		System.out.println(first2 - last2);
		
		int sum = 0;
		int average = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			average = sum / ages.length;

		}
		System.out.println(average);
		//2.
		sum = 0;
		average = 0;
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
			average = sum / names.length;
		}
		System.out.println(average);
		String concatNames = "";
		for (int i = 0; i < names.length; i++) {
			concatNames += names[i] + " ";
		}
		System.out.println(concatNames);
		//3. arrayName[arrayName.length-1]
		//4. arrayName[0]
		//5.
		int[] nameLength = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLength[i]=names[i].length();
		}
		//6.
		int sumOfNameLength = 0;
		for (int i = 0; i < nameLength.length; i++) {
			sumOfNameLength += nameLength[i];
		}
		System.out.println(sumOfNameLength);
	//7.
	String word = "Hello";
	int n = 3;
	String concatenated=concatWord(word,n);
	System.out.println(concatenated);
	//9.
	int[] myArray = new int[] {25, 3, 6, 8};
	boolean isSumGreaterThan100 = isSumGreaterThan100(myArray);
	System.out.println(isSumGreaterThan100);
	//10.
	double[] doubleArray = new double[] {1, 3, 5, 7, 9};
	System.out.println(getAverage(doubleArray)); 
	//11.
	double [] average2 = new double[] {16, 21, 30, 40};
	double [] average1 = new double[] {5, 10, 16, 18};
	boolean isGreater = true;
	System.out.println(isGreater);
	//12.
	boolean isHotOutside = true;
	double moneyInPocket = 0.50;
	boolean willBuyDrink = isHotOutside && moneyInPocket > 10.50;
	System.out.println(willBuyDrink);
	//13.
	double[] hoursWorked = {8.0, 5.5, 7.0, 6.0, 5.5}; 
	double payRate = 16.67;
	System.out.println(checkBalance(hoursWorked,payRate)); 
	}
	//7. method
	public static String concatWord (String word, int n) {
		String concatenated = "";
		for (int i = 0; i < n; i++) {
			concatenated+=word;
		}
		return concatenated;
	}
	//8. method
	public static String fullName (String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;
	}
	 
	//9. method
	public static boolean isSumGreaterThan100 (int[]intArray) {
		// loop through array 
		// sum each elements of array 
		// if sum greater than 100
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			
		} if (sum > 100) {
			return true;
		} else {
			return false;
		} 
	
	}
	//10. method
	public static double getAverage(double[] doubleArray) {
		//loop through array
		//average sum / length
		double sum = 0;
		double getAverage = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			sum+=doubleArray[i];
			getAverage = sum / doubleArray.length;
		}
		return getAverage;	
		
	}
	//11. method
	public static boolean isGreater (double[]average1, double[]average2) {
		//find average of 2 arrays
		//compare value of averages
		double sum1 = 0;
		double getAverage1 = 0;
		double sum2 = 0;
		double getAverage2 = 0;
		for (int i = 0; i < average1.length; i++) {
			sum1+=average1[i];
			getAverage1 = sum1 / average1.length;
		for (i=0; i < average2.length; i++) {
			sum2+=average2[i];
			getAverage2 = sum2 / average2.length;
		if (getAverage1 > getAverage2);
			
		} 
		}
		return true;	 
	}
	//12. method
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		//is hot outside = true and money is greater than 10.50
		if (isHotOutside && moneyInPocket > 10.50);
		return true;
	} 
	//13. method
	public static double checkBalance (double[] hoursWorked, double payRate) {
		//problem will take number in hours worked daily
		//multiplied by number in pay rate
		//to calculate balance on a weekly check 
		double sumOfHours = 0;
		double checkBalance = 0;
		for (int i = 0; i < hoursWorked.length; i++) {
			sumOfHours += hoursWorked[i];
			checkBalance = sumOfHours * payRate;
		}	
		return checkBalance;
		
	}
}
