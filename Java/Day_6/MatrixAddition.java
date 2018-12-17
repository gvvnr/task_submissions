/*
 * Program to find sum of two matrix
 */
import java.util.Scanner;
public class MatrixAddition {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of first matrix :");
		int rowSize1=sc.nextInt();
		System.out.println("Enter the coulmn size of second matrix :");
		int coulmnSize1=sc.nextInt();
		int[][] matrix1=new int[rowSize1][coulmnSize1];
		System.out.println("Adding Elements into the 1 st matrix :");
		for(int row=0;row<rowSize1;row++){
			for(int coulmn=0;coulmn<coulmnSize1;coulmn++){
				System.out.print("Entring element in 1 st matrix row no: "+(row+1)+" coulmn no :"+(coulmn+1)+":");
				matrix1[row][coulmn]=sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("Enter the row size of second matrix :");
		int rowSize2=sc.nextInt();
		System.out.println("Enter the coulm size of second matrix :");
		int coulmnSize2=sc.nextInt();
		int[][] matrix2=new int[rowSize2][coulmnSize2];
		System.out.println("Adding Elements into the 2 nd matrix :");
		for(int row=0;row<rowSize2;row++){
			for(int coulmn=0;coulmn<coulmnSize2;coulmn++){
				System.out.print("Entring element in 2 nd matrix row no: "+(row+1)+" coulmn no: "+(coulmn+1)+":");
				matrix2[row][coulmn]=sc.nextInt();
				System.out.println();
			}
		}
		if(rowSize1!=rowSize2 && coulmnSize2!=coulmnSize2)
			System.out.println("Matrix addition is not possible :");
		else{
			System.out.println("Addition of two matrices is :");
			for(int row=0;row<rowSize2;row++){
				for(int coulmn=0;coulmn<coulmnSize2;coulmn++){
					System.out.print(matrix1[row][coulmn]+matrix2[row][coulmn]);
				}
				System.out.println();
			}
			
		}
		
	}

}
