package day99_myExtras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class fibonacci {
	

	public static void main(String[] args) {
		// check the given number an element of fibonacci series or not
		
		System.out.println("WELLCOME");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check with fibonacci serie");
		int number = scan.nextInt();
		
		/*lets create Fibonacci series until the given integer
		 * The first two terms of the Fibonacci sequence is 0 followed by 1.
		 * The Fibonacci series is a series where the next term is the sum of pervious two terms. 
		 */
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);
		int flag =0;				// flag will be 1 if the number an element of fibonacci series
		for(int i=2 ; list.get(i-1)<number ; i++) {
			
			list.add(list.get(i-1) + list.get(i-2)); // creates new element
			
			if(list.get(i)==number) {				// compares new element with given number
				System.out.println("fibonacci serie contains your number");
				flag++;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("fibonacci serie doesn't contain your number");
		}
		
		System.out.println("the fibonacci series includes that numbers until your integer" + list);
		
		

	}

}
