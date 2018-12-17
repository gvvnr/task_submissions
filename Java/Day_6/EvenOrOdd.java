
/*
 *Test whether given number is even or odd
    i/p: 10 o/p: even

 */
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input Number to check whether the given input is Even or not :");
		int number=sc.nextInt();//Reading the Input from user
		if(number%2==0)
			//checks the condition by dividing with 2 and getting reminder
			//if reminder is 0 then goes to if statement else goes to else statement 
			System.out.println("Given Input "+number+" is Even Number ");
		else
			System.out.println("Given Input "+number+" is Odd Number ");
	}

}
