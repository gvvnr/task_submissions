/*
Write a java program to print all the alphabets using for loop.

*/

class Alphabet{
            public static void main(String args[]){
                     for(int i=65;i<=122;i++){
                            if(i<91 || i>=97)
                                   System.out.print((char)i);
                     }
            }
}
