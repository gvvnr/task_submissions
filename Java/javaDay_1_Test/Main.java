import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number of  strings required  :");
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Enter String no :"+(i+1));
            String cipherText=sc.next();
            for(int index=0;index<cipherText.length();index++){
                int decipheredText=(int)cipherText.charAt(index);
                decipheredText+=5;
                if(decipheredText>122)
                   System.out.print((char)(decipheredText-122+96));
                else
                    System.out.print((char)decipheredText);
             }
            System.out.println();
        }

    }
}

