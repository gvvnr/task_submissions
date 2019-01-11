import java.util.Scanner;
/*
 *  2.Count number of vowels in a String ”Mississippi” and remove the vowels form the string
 */
public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired String :");
		StringBuilder str=new StringBuilder(sc.next());
		int count=0;
		/*
		 * 
		 */
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U'){
				str.deleteCharAt(i);
				++count;
			}
		}
		System.out.println("Number of vowels are :"+count);
		System.out.println("String after removing vowels are :"+str);
	}

}
