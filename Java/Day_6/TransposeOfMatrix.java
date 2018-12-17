/*
 * Transpose of two matrix
 */
import java.util.Scanner;
public class TransposeOfMatrix {
	Scanner sc;
	byte rowSize;
	byte coulmnSize;
	int[][] matrix;
	/*
	 * Initializing and giving inputs in the constructor
	 */
	TransposeOfMatrix(){
		sc=new Scanner(System.in);
		System.out.println("Enter the row size of a matrix :");
		rowSize=sc.nextByte();
		System.out.println("Enter the coulmn size of a matrix :");
		coulmnSize=sc.nextByte();
		matrix=new int[rowSize][coulmnSize];
		
	}
	/*
	 * Adding Elements into Matrix
	 */
	public void addElementsInMatrix(){
		System.out.println("Adding Elements into the matrix :");
		for(int row=0;row<rowSize;row++){
			for(int coulmn=0;coulmn<coulmnSize;coulmn++){
				System.out.print("Entring element into the matrix row no: "+(row+1)+" coulmn no :"+(coulmn+1)+":");
				matrix[row][coulmn]=sc.nextInt();
				System.out.println();
			}
		}
		
		
	}
	/*
	 * performing transpose of matrix operation
	 */
	public void transposeOfMatrix(){
		System.out.println("Transpose of the given matrix is");
		int count=0;
		for(int coulmn=0;coulmn<coulmnSize;coulmn++){
			for(int row=0;row<rowSize;row++){
				System.out.print(matrix[row][coulmn]);
			}
			System.out.println();
		}		
	}
	public static void main(String args[]){
		TransposeOfMatrix transpose=new TransposeOfMatrix();
		transpose.addElementsInMatrix();
		transpose.transposeOfMatrix();
    }

}
