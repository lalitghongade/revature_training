package regex;

public class regexMaster {

	public static void main(String[] args) {
		/*
		 * Regex - Regular Expression - This is the expression which we can build using some wild cards(Pattern Matching)
		 * 
		 * Some wildcards of Regex
		 * [] - represents expression
		 * ^ - represents not
		 * {} - length
		 * [0-9]{5} - any digit of length 5
		 * [a-z]{4} - any lowercase letters or word of length 4
		 * [a-zA-Z]{10} - any word of any case of length 10
		 * [0-9]{1,4} - any digit of min 1 and max of 4 length
		 * [0-9]{1,} - min 1 and max is any
		 * [^a-zA-Z0-9]  - anything else apart from alphanumeric
		 */

		//The username consist of more than 8 characters and 30
		//the first character must be capitalized.
		//At must have one special char
		
//		8
//		Julia
//		Samantha
//		Samantha_21
//		1Samantha
//		Samantha?10_2A
//		JuliaZ007
//		Julia@007
//		_Julia007
		
		//(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}
		
//		(?=.*[0-9]) a digit must occur at least once
//		(?=.*[a-z]) a lower case letter must occur at least once
//		(?=.*[A-Z]) an upper case letter must occur at least once
//		(?=.*[@#$%^&+=]) a special character must occur at least once
//		(?=\\S+$) no whitespace allowed in the entire string
//		.{8,} at least 8 characters//return 
		
		
		
		
		String str = "J@uliaZ007";
		if(str.length() >= 8 && str.length() <= 30) {
			if(str.matches("([A-Z]*[a-z]*.[0-9]*)")) {
				//
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
