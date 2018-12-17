/*
 * Test whether the given string is palindrome or not
 */
import java.util.Scanner;
public class Palindrome {
	Scanner sc;
	String str;
	boolean is_palindroma;
	/*
	 * Initializing varaibles and taking input string
	 */
	Palindrome(){
		sc=new Scanner(System.in);
		is_palindroma=true;
		System.out.println("Enter the string to check whether it is palindroma or not :");
		str=sc.next();
		
	}
	/*
	 * checking the String whether the given string is palindrome or not
	 */
	public void check(){
		for(byte i=0;i<=str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				is_palindroma=false;
				i=(byte) str.length();
			}
		}
		if(is_palindroma)
			System.out.println("Given String is Palindroma :");
		else
			System.out.println("Given String is not a Palindroma :");
	}
	public static void main(String args[]){
		Palindrome palindrome=new Palindrome();
		palindrome.check();
	}

}
