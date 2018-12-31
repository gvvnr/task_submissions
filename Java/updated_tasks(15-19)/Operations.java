import java.util.Scanner;

/*
 * Do the following exercise
 * Create an interface 'Shape' with PI value as 3.14159 and a method 'volume(float a, float b)' 
 * Implement this interface individually in 'Sphere' and 'Cylinder' classes to find their volumes. 
 * Hint:- Volume of sphere = 4*PI*r*r*r/3 
 * Volume of sphere = PI*r*r*h 
 *  
 *     
 *  @author  Guggilam Vamsi
 *  @version 1.8.0
 *  @since   2018-12-28 
 *
 */

interface Shape{
	float PI=(float) 3.14159f;
	public void volume(float a);
	
}

class Sphere implements Shape{
    float volume;
	public void volume(float radius) {
		
		volume=(4*PI*radius*radius*radius)/3;
	}
	public float getVolume(){
		return volume;
	}
	
}
class Cylinder implements Shape{
	float volume;
	public void volume(float radius) {
		volume=PI*radius*radius;
		
	}
	public float getVolume(){
		return volume;
	}
}
public class Operations {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Sphere sphere=new Sphere();
	System.out.println("Enter the radius of sphere to find volume :");
	sphere.volume(sc.nextInt());
	System.out.println("Volume of sphere is :"+sphere.getVolume());
	Cylinder cylinder=new Cylinder();
	System.out.println("Enter the radius of Cylinder to find volume :");
	cylinder.volume(sc.nextFloat());
	System.out.println("Volume of Cylinder is :"+cylinder.getVolume());
}
}
