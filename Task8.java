//Write a program to print below student marks who have scored above 80. Ex: 78, 12, 89, 55, 35

package javaassignment;

public class Task8 {
	public static void main(String[] args) {

		int [] arr = new int[] {78, 12, 89, 55, 35};
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]>80)
			{
				System.out.print("Student marks scored above 80 : " + arr[i]); 
			}
		}
		
		
	}
}
