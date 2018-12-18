/*
 * Write a program to print Pascal's triangle
        Input number of rows: 5                                                          
              1                                                                          
             1 1                                                                         
            1 2 1                                                                        
           1 3 3 1                                                                       
          1 4 6 4 1

 
 */
import java.util.Scanner;
import java.lang.Math;
/*
 * @author vamsi
 * @version 1.8
 * @since 18-12-2018
 */
public class PascalsTriangle {
	Scanner sc;
	int[][] a;
	byte size;
	PascalsTriangle(){
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of pascals triangle :");
		size=sc.nextByte();
		a=new int[size+1][size+1];
	}
	/*
	 * arrange() method stores the values of each row in a two dimensional array
	 * 
	 */
	public void arrange(){
		for(int i=0;i<=size;i++){
			for(int j=0;j<=i;j++){
				if(j==0 || j==i-1){
					
					a[i][j]=1;
				}
					
				else if(i==1){
					a[i][j]=3;
				}
				else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
	}
	/*
	 * display() method displays the pattern by taking values stored in an array
	 */
	public void display(){
		for(int i=0,k=1;i<=size;i++,k++){
			for(byte space=1;space<=size-k+1;space++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print(a[i][j]+" ");
				
			System.out.println();
		}
	}
	public static void main(String args[]){
		PascalsTriangle pascal=new PascalsTriangle();
		pascal.arrange();
		pascal.display();
		
	}

}
