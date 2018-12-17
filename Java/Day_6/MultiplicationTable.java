/*
 * Display multiplication table
 *     5*1=5
 *     5*2=10
 *     ...   
 *     5*10=50
 */
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input integer N to print the table  :");
		int multiplicationNumber=sc.nextInt();
		//Here based on given input loop iterates 10 times and prints the table
		for(byte i=1;i<=10;i++){
			System.out.println(multiplicationNumber+"*"+i+"="+multiplicationNumber*i);
		}
		
	}

}
