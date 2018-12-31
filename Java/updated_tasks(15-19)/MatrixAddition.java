import java.util.Scanner;
/*
 * Addition of two matrices
 *  Read matrix1    -> getMatrix()
 *  Read matrix2    -> getMatrix()
 *  Add them         -> findSum()
 *  Display sum     -> displaySum()
 *  
 *  
 *  @author  Guggilam Vamsi
 *  @version 1.8.0
 *  @since   2018-12-28 
 *
 */
public class MatrixAddition {
	Scanner sc;
	int matrix1[][],matrix2[][],matrixSum[][];
	short row1,row2,coulmn1,coulmn2;
	MatrixAddition(){
		sc=new Scanner(System.in);
	}
	/*
	 * Below method reads the input values of first matrix
	 */
	protected void getMatrix1(){
		System.out.println("Enter the row size of first matrix");
		row1=sc.nextShort();
		System.out.println("Enter the coulmn size of first matrix");
		coulmn1=sc.nextShort();
		matrix1=new int[row1][coulmn1];
		for(short row=0;row<row1;row++){
			for(short coulmn=0;coulmn<coulmn1;coulmn++){
				System.out.println("Enter row :"+(row+1)+" coulmn :"+(coulmn+1)+" value of 1 st matrix");
				matrix1[row][coulmn]=sc.nextInt();
			}
            System.out.println();
	    }
	}
	/*
	 * Below method reads the input values of second matrix
	 */
	
	protected void getMatrix2(){
		System.out.println("Enter the row size of second matrix");
		row2=sc.nextShort();
		System.out.println("Enter the coulmn size of second matrix");
		coulmn2=sc.nextShort();
		matrix2=new int[row2][coulmn2];
		for(short row=0;row<row2;row++){
			for(short coulmn=0;coulmn<coulmn2;coulmn++){
				System.out.println("Enter row :"+(row+1)+" coulmn :"+(coulmn+1)+" value of 2 nd matrix");
				matrix2[row][coulmn]=sc.nextInt();
			}
		System.out.println();
	    }
		
	}
	/*
	 * Below method adds the first two matrices
	 */
	public void sumMatrix(){
		if(row1==row2 && coulmn1==coulmn2){
			matrixSum=new int[row1][coulmn1];
			for(short row=0;row<row2;row++)
				for(short coulmn=0;coulmn<coulmn2;coulmn++)
					matrixSum[row][coulmn]=matrix1[row][coulmn]+matrix2[row][coulmn];
		}
		else{
			System.out.println("Matrix addition is not possible");
			return;
		}
	}
	/*
	 * Below method displays the addition of both the matrices
	 */
	public void displayMatrixSum(){
		if(row1==row2 && coulmn1==coulmn2){
		System.out.println("Addition of two matrices is:");
		   for(short row=0;row<row2;row++){
			   for(short coulmn=0;coulmn<coulmn2;coulmn++)
				   System.out.print(matrixSum[row][coulmn]);
		       System.out.println();
		   }
	   }
	}
	public static void main(String args []){
		MatrixAddition matrix=new MatrixAddition();
		matrix.getMatrix1();
		matrix.getMatrix2();
		matrix.sumMatrix();
		matrix.displayMatrixSum();
		
	}

}
