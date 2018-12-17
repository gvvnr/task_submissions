/*
 * Test whether given number is prime or not
 *     i/p: 21 o/p: prime number
 */
import java.util.Scanner;
public class PrimeChecking {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input Number N to check whether the given Number is prime number or not:");
		int number=sc.nextInt(),count=0;
		//In below for loop we check by taking the reminder of each element
		//up to the half of the given input element
		//if any of the elements reminder is 0 then exits the condition and goes down to if condition
		for(int element=2;element<=number/2 && count==0;element++){
			if(number%element==0)
				count=1;
		}
		//In the above for loop if any of the iterated elements reminder is not 0 then if condition is executed 
		// if any of the iterated elements condition is 0 else condition statement is printed 
		if(count==0)
			System.out.println("Given Input "+number+" is a prime Number:");
		else
			System.out.println("Given Input "+number+" is not a prime Number:");
	}

}
