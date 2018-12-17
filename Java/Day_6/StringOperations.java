/*
 * Write a program to use all possible methods of String operations
 */
public class StringOperations {
	public static void main(String args[]){
		String s1="semantic bits";
		String s2="semantic bits";
		String s3=new String("semantic bits");		
		System.out.println(s1==s2);//return true as it compares the address as s2 directs to memory location of s1
		System.out.println(s2==s3);//return false as it compares the address as s3 used new key word separate memory is allocated
		String match=s3.intern();//intern method returns intended String
		System.out.println(s2==match);// returns true
		System.out.println(s1.equals(s2));//returns true as compares values inside the string
		System.out.println(s2.equals(s3));//returns true as compares values inside the string
		System.out.println(s1.length());//prints the length of the string
		for(int i=0;i<s1.length();i++){//prints each character in the given string
			System.out.print(s1.charAt(i));
		}
		System.out.println(s1.compareTo(s2));//calculates the length of both the strings
		                               //if length of s1>s2 then prints positive value
		                               //if length of s1<s2 then prints negative value
	                                  ////if length of s1==s2 then prints 0
		String s4=s1.concat("is an IT company");//concat() method concatenates one string with another string
		System.out.println(s4);
		System.out.println(s2.contains("bits"));//returns true if the given string in the contains method is present in the string s2
		System.out.println(s1.endsWith("s"));//returns true if the last word is the string s1 is s
		System.out.println(s1.equalsIgnoreCase(s2));//if both the strings have same characters irrespective of capital or small prints true
		//System.out.println("company name is : %s",s1);
		//System.out.println(format);
		byte[] barr=s1.getBytes();
		for(int i=0;i<barr.length;i++)
			System.out.println(barr[i]);
		char[] ch=new char[11];
		ch[0]='s';
		s1.getChars(1,9, ch,1);//getchar method copies the content of the string into specified char array
		System.out.println(ch);
		System.out.println(s1.indexOf('t'));//prints the index of specified character in the indexOf() method
		System.out.println(s1.isEmpty());//returns true if s1 is empty else false
        //System.out.println(String.join("-","Semantic", "training"));
		//String j=String.join("-","Semantic","bits");
		System.out.println(s1.lastIndexOf('s'));//prints the last index position of particular string
        System.out.println(s1.length());//prints the length of the string
        System.out.println(s1.replace("bits","bits company :"));//replace function replaces the string in first  position with string in second position and prints the result
                                                              //replace function replaces only first occurrence replaceAll function replaces all occurrences
        String name="My name is vamsi";
        System.out.println(name.replaceAll("is","was"));
        String sub_String=s1.substring(0,9);//returns part of string for specified index to specified index
        System.out.println(sub_String);
        ch=s1.toCharArray();// to charArray() function converts string into character array
        for(int i=0;i<ch.length;i++)
        	System.out.println(ch[i]);
        System.out.println(s1.toUpperCase());//toUpperCase() method prints the string in upper case
        String upperCase="SEMANTIC BITS";
        System.out.println(upperCase.toLowerCase());//toLowerCase() function returns the lower case of given string
        String spaces=" Semantic bits ";
        System.out.println(spaces.trim());//trim() function removes spaces at starting and ending of the string
        boolean bol=true;
        System.out.println(String.valueOf(bol));// valueOf() method of String class converts data of any type into string
           
        }

}
