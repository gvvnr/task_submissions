import java.util.Scanner;

/*
 * 7 find the first repetitive letter from the given string String input="abcddeff". return 'd'
 */
public class FirstRepetativeLetter {
	/*
	 * Taking String as input and checking for the repetitive element
	 */
	public String findRepeatCharacter(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count=1;
				}
				if(count==1){
					String ch=findRepeat(i,j,str);
					return ch;
				}
			}
		}
		return null;
		
	}
	public String findRepeat(int start, int end,String str){
		int i=start;
		for(;i<end;i++){
			for(int j=i+1;j<end;j++){
				if(str.charAt(i)==str.charAt(j)){
				  return ""+findRepeat(i,j,str);
				}
			}
		}
		return str.charAt(i)+"";
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		FirstRepetativeLetter repeatLetter=new FirstRepetativeLetter();
		String c=repeatLetter.findRepeatCharacter(str);
		if(c!=null){
			System.out.println("first repetitive letter is :");
			System.out.println(c);
		}
		else{
		System.out.println("repetitive letter doesnot exist :");
		}
		
	}

}
