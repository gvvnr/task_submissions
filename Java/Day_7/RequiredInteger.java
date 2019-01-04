import java.util.Scanner;
/*
 *  10 Let's say we have an array of elements, Print the required integer by passing parameters in the methods
 * 
 */

public class RequiredInteger {
	Scanner sc;
	int size;
	int a[];
	/*
	 * Initializing variables
	 */
	RequiredInteger(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
	    size=sc.nextInt();
		a=new int[size];
		
	}
    /*
	 * Adding elements into array
	 */
	public void addElements(){
		
	for(int i=0;i<size;i++)
		{
			System.out.println("Enter element into array:::::: :");
			a[i]=sc.nextInt();
		}

	}
	/*
	 * Taking the index parameter and printing the value of specified index position if exists
	 */
	public void findElement(int index){
		if(index<size){
			System.out.println(a[index]);
		}
		else{
			System.out.println("you have entered index more than array size :");
		}
	}
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		RequiredInteger requiredInteger=new RequiredInteger();
		requiredInteger.addElements();
		System.out.println("Enter the index of the element to print :");
		requiredInteger.findElement(sc.nextInt());
		
	}

}
