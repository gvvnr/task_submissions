/*
 * Print following
       Input the number: 7 
       Expected Output :                                   
             1                                                  
            212                                                 
           32123                                                
          4321234                                               
         543212345                                              
        65432123456                                             
       7654321234567                                            
        65432123456                                             
         543212345                                              
          4321234                                               
           32123                                                
            212                                                 
             1   

 */
import java.util.Scanner;
/*
 * @author vamsi
 * @version 1.8
 * @since 18-12-2018
 */
public class NumberPattern {
	Scanner sc;
	byte number;
	boolean up;
	NumberPattern(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of number pattern :");
		number=sc.nextByte();
		up=true;
	}
	public void arrange(){
		for(byte i=0,k=1;i<number;i++,k++){
			if(up){
				for(byte j=0;j<number-k;j++)
					System.out.print(" ");
				for(byte l=k;l>0;l--)
					System.out.print(l);
				for(byte l=2;l<=k;l++)
					System.out.print(l);
				System.out.println();
			}
			else{
				for(byte space=0;space<k;space++)
					System.out.print(" ");
				for(byte value=(byte) (number-k);value>0;value--)
					System.out.print(value);
				for(byte value=2;value<=number-k;value++)
					System.out.print(value);
				System.out.println();
				
			}
			if(i==(number-1) && up==true){
				up=false;
				k=0;
				i=0;
			}

		}
	}
	public static void main(String args[]){
		NumberPattern pattern =new NumberPattern();
		pattern.arrange();
	}

}
