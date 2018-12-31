import java.util.Scanner;

/*
 * Do the following exercise
 * 
 *  Create an abstract class Parent with property details and an abstract method 'calculate()'.
 *   Now derive 'Son' class from 'Parent' class and calculate the son's property by implementing the 'calculate()' method.
 *
 *
 *  @author  Guggilam Vamsi
 *  @version 1.8.0
 *  @since   2018-12-28 
 *
 */


/*
 * Parent class contains both abstract and non-abstract methods
 */
abstract class Parent{
	Scanner sc;
	String propertyName;
	String totalValue;
	char check;
	Parent(){
		sc=new Scanner(System.in);
		propertyName="";
		totalValue="";
	}
	/*
	 * In below method we add the properties and values of the particular parent
	 */
	public void propertyDetails(){
		System.out.println("Enter any character other than Y to add the property if exist :");
		check=sc.next().charAt(0);
		while(check!='Y'){
			System.out.println("Enter the property name :");
			propertyName=propertyName+""+sc.next()+" ";
			System.out.println("Enter the value of the property :");
			totalValue=totalValue+sc.next()+" ";
			System.out.println("Enter any character other than Y to add the property if exist :");
			check=sc.next().charAt(0);
		}
		
	}
	/*
	 * Below method is abstract method which does not contain body only the class which extends the Parent class
	 * and if it is not abstract then body will be implemented else the extended class and method is treated as abstract and the class
	 * which extends the particular class will follow the same scenario
	 */
	abstract int calculatePropertyValue();
}
 public class Son extends Parent{
	int propertySum;
    //Son class extends the parent class and the total value is calculated and printed
	public int calculatePropertyValue() {
		String[] total=totalValue.split(" ");
		for(String val: total){
			propertySum+=Integer.parseInt(val);
		}
		return propertySum;
		
	}
	
	public static void main(String args []){
		Son son=new Son();
		son.propertyDetails();
		System.out.println("Calculated total property value is :"+son.calculatePropertyValue());
		
		

		
	}

}
