/*
 Write a program to print odd numbers upto given number
    o/p: 1, 3, 5, 7, ....., 99

 */
import java.util.Scanner;
public class OddNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input N to print odd numbers upto N:");
		int count=sc.nextInt();//Input for printing required number of elements
		for(short number=1;number<count*2;number+=2){
	    //Here for each iteration we add number by 2 and checking the condition by multiplying the given input by "2" and printing the number
			System.out.println(number);
		}
	}

}
