/*
 * 2)Given a sorted array and a target value, return the index if the target is found.
 *  If not, return the index where it would be if it were inserted in order.
 */
import java.util.Scanner;
public class TargetIndex {
	Scanner sc;
	int size;
	int a[];
	/*
	 * Initializing variables
	 */
	TargetIndex(){
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
	 * sorting the array
	 */
	public void sort(){
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	/*
	 * Finding the index and returning 
	 */
	public  int findIndex(){
		System.out.println("Enter the element name to find index :");
		int element=sc.nextInt();
		int i=0;
		for(;i<size;i++){
			if(a[i]>=element){
				return i;
			}
		}
		return i-1;
	}
	public static void main(String args[]){
		TargetIndex target=new TargetIndex();
		target.addElements();
		target.sort();
		int index=target.findIndex();
		System.out.println("Index is :"+index);
		
		
	}

}

