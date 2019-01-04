/*
 * 6 Search particular character in the given string 
 
EX : String = "Manjusha"
  
       Our Target Value  = "u" then returns Test Passed
       Our Target Value  = "K" then returns Test Failed

 */
import java.util.Scanner;
public class SearchCharacter {
	String str;
	/*
	 * Assigining value to the string variable
	 */
	SearchCharacter(String str){
		this.str=str;
		
	}
	/*
	 * Taking the character as parameter and checking if it is present and returning the result
	 */
	public String findCharacter(char ch){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count=1;
				break;
			}
		}
		if(count==1){
			return "Test Passed";
		}
		else{
			return "Test Failed";
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		SearchCharacter search=new SearchCharacter(str);
		System.out.println("Enter the character to search :");
		char ch=sc.next().charAt(0);
		System.out.println(search.findCharacter(ch));
		
	}

}
