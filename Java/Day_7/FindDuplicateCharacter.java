import java.util.Scanner;
/*
 * 5 find the duplicate character in the given String "abcdedef"
 */

public class FindDuplicateCharacter {
	/*
	 * Taking the string parameter and checking for duplicate values
	 */
	public void findDuplicate(String str){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int repeat=1;
			for(int j=0;j<i;j++){
				if(str.charAt(j)==ch){
					repeat=0;
				}
			}
			int count=0;
			if(repeat==1){
				for(int k=i;k<str.length();k++){
					if(str.charAt(k)==ch){
						++count;
					}
				}
				if(count>1){
					System.out.println(ch+" is duplicate character and count is :"+count);
				}
			}
		}
	}
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		FindDuplicateCharacter duplicate=new FindDuplicateCharacter();
		/*
		 * Taking String input
		 */
		System.out.println("Enter the String :");
		String str=sc.next();
		duplicate.findDuplicate(str);
		
		
	}

}
