import java.util.Scanner;

/*
 * 4. Consider an abstract class Factory contains the properties of noOfToolsRequried,
typeOfManufacture and abstract method manufacturedFor. Vehicle is a sub-class(it is also an
abstract class) including a property of noOfGears.
You have a 2 Companies named Honda and MarutiSuzike have to use the properties of Vehicle
and it has its own property modelName.
Now you have do the Execution for Honda and MarutiSuzike
 */


abstract class Factory{

	int noOfToolsRequired;
	String typeOfManufacture;
	public abstract void manufacturedFor(String type);
}
abstract class Vehicle extends Factory{
	public abstract void noOfGears(int gears);
}
class Honda extends Vehicle{
	int gears;
	String type;
	public void noOfGears(int gears) {
		this.gears=gears;
	}

	public void manufacturedFor(String type) {
		this.type=type;
	}
	public void display(){
		System.out.println("The type of vehicle is:"+this.type);
		System.out.println("No of gears for honda is :"+this.gears);
		System.out.println("No of tools required to manufacture Honda is :"+this.noOfToolsRequired);
		System.out.println("Type of manufacture is :"+this.typeOfManufacture);
		
	}
	
}
class MaruthiSuziki extends Vehicle{
	int gears;
	String type;

	public void noOfGears(int gears) {
		this.gears=gears;
	}

	public void manufacturedFor(String type) {
           this.type=type;
		
	}
	public void display(){
		System.out.println("Type of manufacture is :"+this.typeOfManufacture);
		System.out.println("The type of vehicle is:"+this.type);
        System.out.println("No of gears for honda is :"+this.gears);
		System.out.println("No of tools required to manufacture Honda is :"+this.noOfToolsRequired);
	}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Honda hondaBike=new Honda();
		System.out.println("Enter the no of gears for Honda :");
		int gears=sc.nextInt();
		System.out.println("Enter the no of tools required to manufacture :");
		hondaBike.noOfToolsRequired=sc.nextInt();
		System.out.println("Enter the type of manufacture :");
		hondaBike.typeOfManufacture=sc.next();
		hondaBike.noOfGears(gears);
		System.out.println("Enter the type of vehicle :");
		hondaBike.manufacturedFor(sc.next());
		System.out.println("-----------------------------------------------------");
		MaruthiSuziki car=new MaruthiSuziki(); 
		System.out.println("Enter the no of gears for MaruthiSuziki :");
		gears=sc.nextInt();
		System.out.println("Enter the no of tools required to manufacture :");
		car.noOfToolsRequired=sc.nextInt();
		System.out.println("Enter the type of vehicle :");
		car.manufacturedFor(sc.next());
		System.out.println("Enter the type of manufacture :");
		car.typeOfManufacture=sc.next();
		car.noOfGears(gears);
		hondaBike.display();
		System.out.println("-----------------------------------------------");
		car.display();
	}

}
