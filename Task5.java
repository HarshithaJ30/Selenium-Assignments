//Write a program to print odd numbers from 1-50

package javaassignment;

public class Task5 {

	public static void main(String[] args) {
		
		int n = 50;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}

	}

}
