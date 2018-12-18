/*
 * Print following
      Input the number: 7 
      Expected Output :               
            A                                                  
           ABA                                                 
          ABCBA                                                
         ABCDCBA                                               
        ABCDEDCBA                                              
       ABCDEFEDCBA                                             
      ABCDEFGFEDCBA                                            
       ABCDEFEDCBA                                             
        ABCDEDCBA                                              
         ABCDCBA                                               
          ABCBA                                                
           ABA                                                 
            A    

 */
import java.util.Scanner;
/*
 * @author vamsi
 * @version 1.8
 * @since 18-12-2018
 */
public class AlphabetPattern {
	Scanner sc;
	byte number;
	boolean up;
	/*
	 * Here constructor is initializing the variables and taking input to print pattern of given size
	 */
	AlphabetPattern(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern :");
		number=sc.nextByte();
		up=true;
	}
	/*
	 * arrange() method prints characters in diamond pattern
	 */
	public void arrange(){
		for(byte i=65,k=0;i<65+number;i++,k++){
			if(up){

				for(byte j=(byte) ((byte)65+number);j>65+k+1;j--)
					System.out.print(" ");
				for(byte l=65;l<=65+k;l++)
					System.out.print((char)l);
				for(byte l=(byte) (65+k-1);l>=65;l--)
					System.out.print((char)l);
				System.out.println("");
				
			}
			else{
				for(byte space=0;space<k;space++)
					System.out.print(" ");
				for(byte l=65;l<65+number-k;l++)
					System.out.print((char)l);
				for(byte l=(byte) (65+number-k-2);l>=65;l--)
					System.out.print((char)l);
				System.out.println();
			}
			
			if(i==65+number-1 && up==true){
				up=false;
				i=65;
				k=0;
			}
				
		}
	}
	
	public static void main(String args[]){
		AlphabetPattern pattern=new AlphabetPattern();
		pattern.arrange();
	}

}
