//Write a java program to swap two number with a=10 and b=20
package javaassignment;

public class Task1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before swap the value of a is "  +a);
		System.out.println("Before swap the value of b is "  +b);
		
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap the value of a is " + a);
		System.out.println("After swap the value of b is " + b);
		
	}

}
