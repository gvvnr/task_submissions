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
	float totalValue;
	float car;
	float house;
	float land;
	float gold;
	float parentPropertyValues;
	Parent(){
		sc=new Scanner(System.in);
	}
	/*
	 * In below method we add and values to the particular parent properties
	 */
	public void propertyDetails(){
			System.out.println("Enter the value of Car :");
			car=sc.nextFloat();
			System.out.println("Enter the value of house :");
			house=sc.nextFloat();
			System.out.println("Enter the value of land :");
			land=sc.nextFloat();
			System.out.println("Enter the value of gold :");
		    gold=sc.nextFloat();
		    parentPropertyValues=car+house+land+gold;
	}
	/*
	 * Below method is abstract method which does not contain body only the class which extends the Parent class
	 * and if it is not abstract then body will be implemented else the extended class and method is treated as abstract and the class
	 * which extends the particular class will follow the same scenario
	 */
	abstract float calculatePropertyValue(float bikeCost,float carCost);
}
 public class Son extends Parent{
	int propertySum;
    //Son class extends the parent class and the total value is calculated and printed
	public float calculatePropertyValue(float bikeCost,float carCost) {
		
		return parentPropertyValues+bikeCost+carCost;
		
	}
	
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		Son son=new Son();
		System.out.println("Enter the value of sons bike :");
        float bikeCost=sc.nextFloat();
		System.out.println("Enter the value of sons car :");
        float carCost=sc.nextFloat();
		son.propertyDetails();
		System.out.println("Calculated total property value  is :"+son.calculatePropertyValue(bikeCost,carCost));
		
		

		
	}

}
