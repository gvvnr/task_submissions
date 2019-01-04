/*
 * 1 Find out the missing number in the array of length n-1 and integers in the range of 1 to n

 */
import java.util.Scanner;
public class MissingElement {
	Scanner sc;
	int length;
	int a[];
	/*
	 * Initializing variables
	 */
	MissingElement(){
		sc=new Scanner(System.in);
		System.out.println("Enter the range of integers :");
		length=sc.nextInt();
		a=new int[length];
	}
	/*
	 * Adding elements into array
	 */
	public void addElements(){
		for(int i=0;i<length;i++){
			System.out.println("Enter element :");
			a[i]=sc.nextInt();
		}
	}
	/*
	 * sorting the array elements
	 */
	public void sort(){
		for(int i=0;i<length;i++){
			for(int j=0;j<length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	/*
	 * printing missing elements up to length-1
	 */
	public void missingElement(){
		System.out.println("Elements are :");
		int count=0;
		for(int i=0;i<length;i++){
			System.out.print(a[i]+" ");
			if(count<length-1){
				for(int j=a[i]+1;j<a[i+1] && count<length-1;j++,++count){
					System.out.print(j+" ");
				}
			}
			
			
		}

	}
	public static void main(String args[]){
		
		MissingElement element=new MissingElement();
		element.addElements();
		element.sort();
		element.missingElement();
		


	}

}
