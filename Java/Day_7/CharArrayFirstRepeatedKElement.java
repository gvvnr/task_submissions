/*
 * 4 Given char array [a,b,b,c,d,f]
   given value k
   return first element that occurs in this array k times
   k=2 return b
   k=3 return anything
   k=1 return a

 */
import java.util.Scanner;
public class CharArrayFirstRepeatedKElement {
	Scanner sc;
	char[] c;
	int size;
	/*
	 * Initialzing the variables
	 */
	CharArrayFirstRepeatedKElement(){
		sc=new Scanner(System.in);
		System.out.println("enter the size of elements :");
		size=sc.nextInt();
		c=new char[size];
		
	}
	/*
	 * Inserting values into array
	 */
	public void addElements(){
		for(int i=0;i<size;i++){
			System.out.println("Add Element into the array :");
			c[i]=sc.next().charAt(0);	
		}
		
	}
	/*
	 * Finding the occurence  of value k times and printing
	 */
	public String findOccurences(){
		System.out.println("Enter the K value to find the occurence of character K times:");
		int k=sc.nextInt();
		for(int i=0;i<size;i++){
			//char element=c[i];
			int count=0;
			for(int j=0;j<size;j++){
				if(c[j]==c[i]){
					++count;
				}
				
			}
			if(k==count){
				return c[i]+"";
			}
		}
		return "anything";
		
		
	}
	public static void main(String args[]){
		CharArrayFirstRepeatedKElement element =new CharArrayFirstRepeatedKElement();
		element.addElements();
		System.out.println(element.findOccurences());
	}
}
