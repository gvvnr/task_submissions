import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student{
	int id;
	String name;
	float marks;
	Address address;
	public Student(int id, String name, float marks, Address address) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
}
class Address{
	String doorno,streetName,city;

	public Address(String doorno, String streetName, String city) {
		this.doorno = doorno;
		this.streetName = streetName;
		this.city = city;
	}



	public String getDoorno() {
		return doorno;
	}

	

	public String getStreetName() {
		return streetName;
	}


	public String getCity() {
		return city;
	}

	
	
}
public class Main1 implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.id>o2.id){
			return 1;
		}
		else if(o2.id>o1.id){
			return -1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<3;i++){
			System.out.println("Enter the Id of the student :");
			int id=sc.nextInt();
			System.out.println("Enter the name of the student :");
			String name=sc.next();
			System.out.println("Enter the marks of the student :");
			float marks=sc.nextFloat();
			System.out.println("Enter the city of the student :");
			String city=sc.next();
			System.out.println("Enter the street Name of the Student :");
			String streetName=sc.next();
			System.out.println("Enter the door number of the student :");
			String doorNo=sc.next();
			Address address=new Address(doorNo,streetName,city);
			Student s=new Student(id, name, marks, address);
			al.add(s);
			
		}
		Collections.sort(al, new Main1());
		Student removeStudent = null;
		System.out.println("ID s of students  before removing are :");
		for(Student s :al){
			System.out.println(s.id);
			if(s.id==2){
				removeStudent=s;
				
			}
		}

		al.remove(removeStudent);
		System.out.println("Id of the student having 2 is removed :");
		System.out.println("Enter the Id of the student to rename :");
		int id=sc.nextInt();
		for(Student s :al){
			if(s.id==id){
				System.out.println("Enter the name :");
				s.name=sc.next();
				
			}
		}
		System.out.println("Names of student after modifying :");
		for(Student s :al){
				System.out.println(s.name);
			
		}
		
		
		
	}

}
