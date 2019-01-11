import java.util.Scanner;
/*
 * Create a Employee class with name, employeeId, salary as properties and create a employee
arraylist with the employees.
Override toString method to display employee details. And read input from user to display
employee details of at given position. Ex: If user enters 1 display the details at position one in
the array.
 */

public class Employee{
	private String name;
	private String employeId;
	private String salary;
	public void setName(String name){
		this.name=name;
	}
	public void setEmployeeId(String employeId){
		this.employeId=employeId;
	}
	public void setSalary(String salary){
		this.salary=salary;
	}
	public String toString(){
		return "Name is :"+this.name+"\n"+"Salary is :"+this.salary+"\n"+"Employee id is :"+this.employeId+"\n";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees :");
		int size=sc.nextInt();
		Employee e[]=new Employee[size];
		for(int i=0;i<size;i++){
			e[i]=new Employee();
			System.out.println("Enter the name of the employee :");
			e[i].setName(sc.next());
            System.out.println("Enter the Id of the employee :");
			e[i].setEmployeeId(sc.next());
			System.out.println("Enter the salary of the employee :");
			e[i].setSalary(sc.next());
		}
		System.out.println("Enter the position of the Employee to display details :");
		int position=sc.nextInt();
		if(position<=size){
			System.out.println(e[position-1]);
		}
		else{
			System.out.println("You Entered an invalid position :");
		}
		
	}

}
