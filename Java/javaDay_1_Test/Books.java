import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Book{
    protected String bookTitle;
    protected double bookPrice;
    Book(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public double getBookPrice(){
        return this.bookPrice;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public abstract void setPrice(double price);
}
class Fiction extends Book{
    Fiction(String bookTitle){
        super(bookTitle);
        setPrice(24.99);

    }
    public  void setPrice(double price){
        bookPrice=price;
    }
}
class NonFiction extends Book{
    NonFiction(String bookTitle){
        super(bookTitle);
        setPrice(37.99);

    }
    public  void setPrice(double price){
        bookPrice=price;
    }
}
public class Books{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Title of the Fiction book :");
        Book fiction=new Fiction(sc.nextLine());
        System.out.println("Enter the title of the non-fiction book :");
        Book nonFiction=new NonFiction(sc.nextLine());
        ArrayList al=new ArrayList();
        al.add(fiction);
        al.add(nonFiction);
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            Book b=(Book)itr.next();
            System.out.println("Title -"+b.getBookTitle()+" cost -"+b.getBookPrice());
        }

    }
}
