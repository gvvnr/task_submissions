/*
 * Write a method to accept a year number, test and display whether the 
 * given number is leap year or not
 * 
 * @author  Guggilam Vamsi
 * @version 1.8.0
 * @since   2018-12-28 
 * 
 */
import java.util.Scanner;
public class LeapYear {
	short year;
	/*
	 * getYear(short year) method takes the input and finds whether the given 
	 * input year is leap year or not
	 */
	protected void getYear(short year){
		this.year= (short)(year%400);
		this.year=(short)(this.year%4);
	}
	/*
	 * Below method displays if statement if the given year is true else 
	 * else statement
	 */
	public void displayResult(){
		if(this.year==0)
			System.out.println("Given year is leap year :");
		else
			System.out.println("Given year is not leap year :");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LeapYear year=new LeapYear();
		System.out.println("Enter the year to find whether it is leap year or not :");
		year.getYear(sc.nextShort());
		year.displayResult();
	}

}
