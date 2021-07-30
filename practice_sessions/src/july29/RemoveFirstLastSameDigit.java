package july29;

public class RemoveFirstLastSameDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Problem-
		 * 5)Take array as input remove the digits where the first value and last value is same
 * eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
 * so output will be [344,699]*/
		int[] arr = {101,22,10001, 344,699, 7273138};
		isFirstAndLastDigitSame(arr);
	}
	
	public static void isFirstAndLastDigitSame(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int lastDigit = 0;
			lastDigit = x%10;
			while(!(x > 0 && x <= 9)) {
				x/=10;
			}
			if(x==lastDigit) {
				System.out.println(arr[i]+ "'s first and last digit is same");
			}
		}
	}

}
