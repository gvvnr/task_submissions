import java.util.Scanner;

public class Multiples {
    public String returnValue(int value){
        if(value%3==0 && value%5==0){
            return "FizzBuzz";
        }
        else if(value%5==0){
            return "Buzz";
        }
        else if(value%3==0){
            return "Fizz";
        }
        else{
            return Integer.toString(value);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Multiples m=new Multiples();
        System.out.println("Enter the total numbers you want to Enter :");
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Enter the input number :"+(i+1));
              //  int value=sc.nextInt();
            System.out.println(m.returnValue(sc.nextInt()));
        }
    }
}
