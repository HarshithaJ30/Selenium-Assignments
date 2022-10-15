//Write a program to print the average of below 5 number. (10, 90.78, 111, 8989, 7876)

package javaassignment;

public class Task3 {

	public static void main(String[] args) {

		float [] arr = new float[] {10, (float) 90.78, 111, 8989, 7876};
		float sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		sum = sum/arr.length; //10+90.78+111+8989+7876 = 17076.78/5 = 3415.3562
		System.out.print("The sum of given number is " +sum); 
			
		
	}

}
