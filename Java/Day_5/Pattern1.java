/*
Write a java program to print the following pattern using while loop
Input n = 3
*****
*
*****
**********
**
**********
***************
***
***************

*/
import java.util.Scanner;
class Pattern1{
          public static void main(String args[]){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the Input number to print pattern:");
                  int num=sc.nextInt();
                  int index=1;
                  while(index<=num){
                             int repeat=0;
                             while(repeat<index*5){
                             System.out.print("*");
                             repeat++;
                             }
                             System.out.println();
                             int mid=0;
                             while(mid<index){
                             System.out.print("*");
                             mid++;
                             }
                             System.out.println();
                             repeat=0;
                             while(repeat<index*5){
                             System.out.print("*");
                             repeat++;
                             }
                             System.out.println();
                  index++;
                  }

          }
}
