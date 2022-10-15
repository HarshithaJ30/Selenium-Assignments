//Write a program to print all the even numbers from 1-200

package javaassignment;

public class Task4 {

	public static void main(String[] args) {
		
		int n = 200;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==0){
				System.out.println(i);
			}
		}
		

	}
}
