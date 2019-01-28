import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

class Student implements Serializable{
	String id;
	String name;
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
class Address implements Serializable{
	String doorNo;
	String street;
	String city;
	String state;
	public Address(String doorNo, String street, String city, String state) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	
	
	
	
}
public class College {
	Scanner scanner;
	Scanner scanner1;
	HashMap<Student,Address> studentDetails;
	int totalStudents;
	
	public College() {
		scanner=new Scanner(System.in);
		scanner1=new Scanner(System.in);
		studentDetails=new HashMap<>();
		System.out.println("Enter the total number of students to be added into the HashMap :");
		totalStudents=scanner.nextInt();
	}
	public void addDetails(){
		for(int index=0;index<totalStudents;index++){
			System.out.println("Enter the name of the student :");
			String name=scanner1.nextLine();
			System.out.println("Enter the id of the Student :");
			String id=scanner.next();	
			Student student =new Student(id, name);
			System.out.println("Enter the city of the student :");
			String city=scanner1.nextLine();
			System.out.println("Enter the door no of Student :");
			String doorNo=scanner.next();
			System.out.println("Enter the street name of the student :");
			String street=scanner.next();
			System.out.println("Enter the state of the student :");
			String state=scanner1.nextLine();
			Address address=new Address(doorNo, street, city, state);
			studentDetails.put(student, address);
		}
	}
	public void addIntoFile() throws IOException{
		FileOutputStream fout=new FileOutputStream("student.ser");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(studentDetails);
		out.close();
		fout.close();
	}
	public void retriveFromFile() throws IOException, ClassNotFoundException{
		FileInputStream fin=new FileInputStream("student.ser");
		ObjectInputStream oin=new ObjectInputStream(fin);
	    studentDetails=(HashMap<Student, Address>) oin.readObject();
	    Set studentSet=studentDetails.entrySet();
	    Iterator itr=studentSet.iterator();
		while(itr.hasNext()){
			Map.Entry studentKey=(Entry) itr.next();
			Student student=(Student)studentKey.getKey();
			System.out.println("Id of the Student is :"+student.id);
			System.out.println("Name of student is :"+student.name);
			Address address=(Address)studentKey.getValue();
			System.out.println("state of the student is :"+address.getState());
			System.out.println("city of the student is :"+address.getCity());
			System.out.println("street of the student is :"+address.getStreet());
			System.out.println("Door no of the student :"+address.getDoorNo());
					}
		oin.close();
		fin.close();
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		College college=new College();
		college.addDetails();
		college.addIntoFile();
		college.retriveFromFile();
		
	}

}
