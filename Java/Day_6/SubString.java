/*
 * 10> Write a program to find below ones from the given string
    a> the positions of substring
    b> repeated count of substring
    c> remove the occurrence of the substring from main string and print
    i/p: 
        Main string: String s = "This is my palace"
        substring: is
    o/p:sub-string: is
        indexes: 2,5
        repeated count: 2
        main string after removal: "Th  my palace"
 */
import java.util.Scanner;
public class SubString {
	Scanner sc;
	int repeat;
	String str;
	String subString;
	String[] word;
	boolean is_match;
	String match_index; 
	SubString(){
		sc=new Scanner(System.in);
		match_index="";
		System.out.println("Enter the String :");
		str=sc.nextLine();
		System.out.println("Enter the sub-string to match :");
		subString=sc.next();
		
		
	}
	public void wordCount(){
		for(int i=0;i<str.length();i++){
			is_match=true;
			int check=i,j=0;
			--check;
			for(j=0;j<subString.length();j++)
				if(str.charAt(++check)!=subString.charAt(j)){
					j=subString.length()-1;
                    is_match=false;
				}
			if(j==subString.length() && is_match==true){
				match_index+=i;
				++repeat;
			}			
		}
		

		str=str.replaceAll(subString,"");
         
		
	}
	public void displayResult(){
		System.out.println("repeated count : "+repeat);
		System.out.print("Match index :");
		for(int i=0;i<match_index.length()-1;i++)
		      System.out.print(match_index.charAt(i)+",");
		System.out.println(match_index.charAt(match_index.length()-1));
        System.out.println("main string after removal :"+str);
	}
	public static void main(String args[]){
		SubString s=new SubString();
		s.wordCount();
        s.displayResult();

	}

}
