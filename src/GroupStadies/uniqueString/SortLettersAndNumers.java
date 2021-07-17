package GroupStadies.uniqueString;

public class SortLettersAndNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigitsFromString("AB1NV2MFJ3"));
		System.out.print("Hello world");
	

	}
	
	public static int sumOfDigitsFromString(String word) {
		int sum = 0;
		for(int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				sum += word.charAt(i);
			}
		}
		
		return  sum;
	}

}
