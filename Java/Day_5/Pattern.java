import java.util.Scanner;
class Pattern{
          public static void main(String args[]){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the Number:");
                  int num=sc.nextInt();
                  for(int index=1;index<=num;index++){
                             for(int repeat=0;repeat<index*5;repeat++){
                             System.out.print("*");
                             }
                             System.out.println();
                             for(int mid=0;mid<index;mid++){
                             System.out.print("*");
                             }
                             System.out.println();
                             for(int repeat=0;repeat<index*5;repeat++){
                             System.out.print("*");
                             }
                             System.out.println();
                  }

          }
}
