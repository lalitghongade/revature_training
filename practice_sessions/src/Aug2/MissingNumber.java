package Aug2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem Statement : find missing number from given Array
		//as you didn't mention relation of numbers in array so i took basic one!
		int []arr = {1,2,3,4,5,6,7,9,10};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1)
			{
				continue;
				//traversing through array
				//checking relation between numbers  
			}
			else {
				//storing missing number
				temp=arr[i]+1;
				
			}
			//printing given array
			System.out.println("Given Array :"+Arrays.toString(arr));	
			//printing missing number
			System.out.println("Missing Number in given Array::\t"+temp);
			
		}

	}

}
