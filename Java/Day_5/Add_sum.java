/*
Write a java program to print the following series using for loop 
1,2,4,7,11,16,22…. For a given number n.

*/


import java.util.Scanner;
class Add_sum{
          public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the Input N for printing series upto N numbers :");
                    int max=sc.nextInt();
                    int num=1,add=1;
                          for(int i=0;i<max;i++){
                          System.out.println(num);
                          num+=add;
                          add++;
                          }
          }
}
