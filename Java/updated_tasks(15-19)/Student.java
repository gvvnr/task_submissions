import java.util.*;
/*
 * Do the following exercise
 * Create a student class with id and name.
 * In that class, create an inner class 'Dob' with dd,mm,yy properties.
 * Create 2 objects and store 2 students date of birth details. 
 * Find number of days difference in the date of birth of students
 * 
 * 
 * @author  Guggilam Vamsi
 *  @version 1.8.0
 *  @since   2018-12-28 
 *
 * 
 *  */
public class Student {
	String id;
	String name;
	Scanner sc;
	/*
	 * Initialized the constructor 
	 */
	Student(){
		sc=new Scanner(System.in);
	}
	/*
	 * reading id and name of student
	 */
	public void studentDetails(){
		System.out.println("Enter the id of the student :");
		id=sc.next();
		System.out.println("Enter the name of the student :");
		name=sc.next();		
		
	}
	class DateOfBirth{
		String dob;
		/*
		 * reading date of birth of student
		 */
		public void studentDOB(){
			studentDetails();			
			System.out.println("Enter the Date of Birth of the student in DD/MM/YYYY format :");
			dob=sc.next();
			
		}
		public String getId(){
			return Student.this.id;
		}
		public String getDOB(){
			return this.dob;
		}
		
	}

	public static void main(String args[]){
		Student.DateOfBirth student1=new Student().new DateOfBirth();
		student1.studentDOB();
		Student.DateOfBirth student2=new Student().new DateOfBirth();
		student2.studentDOB();
		/*
		 * Getting date of birth of two students
		 */
		String date1[]=student1.getDOB().split("/");
		int date011=Integer.parseInt(date1[0]);
		int month1=Integer.parseInt(date1[1]);
		int year1=Integer.parseInt(date1[2]);
		String date2[]=student2.getDOB().split("/");
		int date012=Integer.parseInt(date2[0]);
		int month2=Integer.parseInt(date2[1]);
		int year2=Integer.parseInt(date2[2]);
		int days=0;
		/*
		 * Calculating difference between two dates
		 */
		if(year1==year2 && month1==month2){
			date012=date011-date012;
			if(date012<0)
			    System.out.println("No of days differences between two dates is :"+-date012);
			else
				System.out.println("No of days differences between two dates is :"+date012);
		}
		if(year1>year2){
			int temp=year2;
			year2=year1;
			year1=temp;
			temp=date011;
			date011=date012;
			date012=temp;
			temp=month1;
			month1=month2;
			month2=temp;
		}
		if(year1<year2){
			int i=year1+1;
			for(;i<year2;i++){
				if(i%4==0)
					days+=366;
				else
					days+=365;
					
			}
			int month=month1+1;
			while(month<13){
				if(month==2 && i%4==0)
					days+=29;
				else if(month==2 && i%4!=0)
					days+=28;
				else if(month<8 && month%2==1)
					days+=31;
				else if(month<8 && month%2==0)
					days+=30;
				else if(month>=8 && month%2==0)
					days+=31;
				else if(month>=8 && month%2==1)
					days+=30;
				++month;
			}
			if(month1==2 && i%4==0)
				days+=29-date011;
			else if(month1==2 && i%4!=0)
				days+=28-date011;
			else if(month1<8 && month1%2==1)
				days+=31-date011;
			else if(month1<8 && month1%2==0)
				days+=30-date011;
			else if(month1>=8 && month1%2==0)
				days+=31-date011;
			else if(month1>=8 && month1%2==1)
				days+=30-date011;
			month=1;
			while(month!=month2){
				if(month==2 && i%4==0)
					days+=29;
				else if(month==2 && i%4!=0)
					days+=28;
				else if(month<8 && month%2==1)
					days+=31;
				else if(month<8 && month%2==0)
					days+=30;
				else if(month>=8 && month%2==0)
					days+=31;
				else if(month>=8 && month%2==1)
					days+=30;
				++month;
			}
			if(month2==2 && year2%4==0)
				days+=29-date012;
			else if(month2==2 && year2%4!=0)
				days+=date012;
			else if(month2<8 && month2%2==1)
				days+=date012;
			else if(month2<8 && month2%2==0)
				days+=date012;
			else if(month2>=8 && month2%2==0)
				days+=date012;
			else if(month2>=8 && month2%2==1)
				days+=date012;
			
			System.out.println("No of days difference between two Date of Births is  :"+days);
			
			
		}
		
	}
}
