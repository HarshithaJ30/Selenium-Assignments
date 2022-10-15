//Write a program which will break the current execution if it find Selenium


package javaassignment;

public class Task10 {

	public static void main(String[] args) {

		String []arr = new String[] {"Java", "JavaScript", "Selenium", "Python", "Mukesh"};
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i] == "Selenium") break; 
			{
				System.out.println(arr[i]);
			}		
		}
		
		
	}
}
