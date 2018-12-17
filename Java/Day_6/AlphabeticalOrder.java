/*
 * Sort the given group of strings into alphabetical order[Use bubble sort]
 */
import java.util.Scanner;
public class AlphabeticalOrder {
	Scanner sc;
	String str;
	String[] word;
	AlphabeticalOrder(){
		/*
		 * reading the input and dividing the string into array of strings
		 */
		sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		str=sc.nextLine();
		word=str.split(" ");
	}
	public void arrangeAlphabeticalOrder(){
		/*
		 * arranging the string in alphabetical order
		 */
		
		for(byte i=0;i<word.length;i++){
			for(byte j=0;j<word.length-1;j++){
				if(word[j].compareTo(word[j+1])>0){
					String temperary_word=word[j];
					word[j]=word[j+1];
					word[j+1]=temperary_word;
				}
			}
		}
	}
	public void displayStringAlphabeticalOrder(){
        /*
		 * displaying the arranged string in alpahbetical order
		 */
		for(byte i=0;i<word.length;i++)
			System.out.println(word[i]);
	}
	public static void main(String args[]){
		AlphabeticalOrder order=new AlphabeticalOrder();
		order.arrangeAlphabeticalOrder();
		order.displayStringAlphabeticalOrder();
		
	}

}
