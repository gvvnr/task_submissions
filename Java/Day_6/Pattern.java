/*
 * Display the * in below form based on the given keyboard i/p
    i/p:3
    o/p:
          *
        *  *
      *  *  *
    *  *  *  *
      *  *  *
       *  *
        *
6

 */
import java.util.Scanner;
import java.lang.*;
public class Pattern {
	Scanner sc;
	int size;
	/*
	 * Constructor Initializes the variables and takes size of input to be printed
	 */
	Pattern(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of the pattern to print :");
		size=sc.nextInt();
		
	}
	/*
	 * After giving size as input in diplayPattern method takes the input and prints the pattern upto size N
	 */
	public void displayPattern(){
		int count=0;
		for(byte i=0;i<size;i++){
			if(count==0){
                for(byte j=0;j<size-i;j++)
					    System.out.print(" ");
				for(byte k=0;k<=i;k++)
					System.out.print(" *");
				
			}
			if(count==1){
				for(byte k=0;k<=i+1;k++)
					System.out.print(" ");
                for(byte j=0;j<size-i;j++)
					    System.out.print("* ");


			}
			System.out.println();
			if(i==size-1 && count==0){
				++count;
				i=0;
			}
		}
	
		
	}
	public static void main(String args[]){
		Pattern p=new Pattern();
		p.displayPattern();
	}

}
