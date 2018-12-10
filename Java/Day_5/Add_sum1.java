/*
Write a java program to print the following series using while loop 
1,2,4,7,11,16,22…. For a given number n.

*/

import java.util.Scanner;
class Add_sum1{
        public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 int max=sc.nextInt();
                 int num=1,add=1,i=0;
                     while(i<max){
                             System.out.println(num);
                             num+=add;
                             add++;
                             i++;
                     }
       }
}
