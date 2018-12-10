/*
Write a java program to print all the alphabets using while loop.

*/

class Alphabet1{
            public static void main(String args[]){
                     int i=65;
                     while(i<=122){
                        if(i<91 || i>=97)
                            System.out.print((char)i);
                     i++;
                     }
            }
}
