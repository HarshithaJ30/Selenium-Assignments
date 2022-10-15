//Write a program which will break the current execution if it find number 85, Input-[12, 34, 66, 85, 900]

package javaassignment;

public class Task9 {

	public static void main(String[] args) {
		
		int []arr = new int[] {12, 34, 66, 85, 900};
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i] == 85) break; 
			{
				System.out.println(arr[i]);
			}		
		}

		
	}
}
