/*
 * 3 Remove duplicates from the given array without using set
 */
import java.util.Scanner;
public class DuplicateElementRemoving {
	Scanner sc;
	int size;
	int a[];
	int repeat;
	/*
	 * Intializing the variables
	 */
	DuplicateElementRemoving(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
	    size=sc.nextInt();
		a=new int[size];
		
	}
	/*
	 * Inseting values in to array
	 */
	public void addElements(){
		
	for(int i=0;i<size;i++)
		{
			System.out.println("Enter element into array :");
			a[i]=sc.nextInt();
		}

	}
	public void removeDuplicate(){
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=i+1;j<size;j++){
				if(a[i]==a[j]){
					count=1;
					j=size;
					++repeat;
				}
			}
			if(count==1){
				for(int j=i+1;j<size;j++){
					a[j-1]=a[j];
					
				}
			}

		}

	}
	/*
	 * Displaying elements after removing duplicates
	 */
	public void display(){
		System.out.println("Elements after removing duplicates is :");
		for(int i=0;i<=size-repeat;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args []){
		DuplicateElementRemoving remove=new DuplicateElementRemoving();
		remove.addElements();
		remove.removeDuplicate();
		remove.display();
	}

}
