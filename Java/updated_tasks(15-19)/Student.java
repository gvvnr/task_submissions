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
 class Student {
	String id;
	String name;
	Scanner sc;
	/*
	 * Initialized the constructor and reading id and name of student 
	 */
	Student(String id, String name){
		sc=new Scanner(System.in);
		this.id=id;
		this.name=name;
	}
	int start(int date, int month,int year){
		DateOfBirth dob=new DateOfBirth();
		int days=0;
		if(dob.validate(date,month,year)==true){
			int number=year/100;
			int totYears=number;
			int leap=0;
			if(year>=400){
				leap=(year/400);
				number-=leap;
			}
			//System.out.println(number);
			days=((number*76*365)+(number*24*366))+(((leap)*75*365)+(leap*25*366));
			year=year-(totYears*100);
			leap=(year/400);
			days+=(leap*366);
			year=year-leap;
			days=year*365;
			month=dob.calculateDays(month,year);
			return date+month+days;
		}
		return 0;
		
	}
	class DateOfBirth{
		
		/*
		 * Below method validates the date and returns true if the date is valid else return false
		 */
		public int calculateDays(int month,int year){
			int days=0;
           int monthCount=1;
			while(monthCount<month){
				if(monthCount==2 && year%4==0){
					days+=29;
				}
					
				else if(monthCount==2 && year%4!=0)
					days+=28;
				else if(monthCount<8 && monthCount%2==1){
					days+=31;
				}
				
				else if(monthCount<8 && monthCount%2==0 ){
					days+=30;
				}
					
				else if(monthCount>=8 && monthCount%2==0){
					days+=31;
					
				}
					
				else if(monthCount>=8 && monthCount%2==1){
					days+=30;
				}
					
				++monthCount;
			}

			return days;
		}
		
		public boolean validate(int day, int month, int year) {
			int feb=0;
			if(year%4==0){
				feb=1;
			}
			if( month==2 && feb==1 && day>=1 && day<=29){

				return true;
			}
           
			else if(month==2 && feb==0 && day>=1 && day<=28){
				return true;
				
			}
			else if(month<8 && month%2==1 && day>=1 && day<=31){
				return true;	
			}
			else if( month<8 && month%2==0 && day>=1 && day<=30 && month!=2){
				return true;	
			}
			else if( month>=8 && month%2==0 && day>=1 && day<=31 && month<=12){
				return true;
			}
			else if( month>8 && month%2==1 && day>=1 && day<=30 && month<=12){
				
				return true;
			}
            else{
            	return false;
            } 
			
			
		}
		
	}
	

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of first student :");
		String id=sc.next();
		System.out.println("Enter the name of first student :");
		String name=sc.next();		
		Student student1=new Student(id,name);
		System.out.println("Enter the Date of first students date of birth :");
		int date=sc.nextInt();
		System.out.println("Enter the month of the students date of birth :");
		int month=sc.nextInt();
		System.out.println("Enter the year of the students date of birth :");
		int year=sc.nextInt();
		int student1Days=student1.start(date, month, year),student2Days;
		if(student1Days!=0){
			Student student2=new Student(id,name);
			System.out.println("Enter the id of second student :");
			id=sc.next();
			System.out.println("Enter the name of second student :");
			name=sc.next();
			System.out.println("Enter the Date of second students date of birth :");
			date=sc.nextInt();
			System.out.println("Enter the month of second students date of birth :");
			month=sc.nextInt();
			System.out.println("Enter the year of second students date of birth :");
			year=sc.nextInt();
			student2Days=student2.start(date, month, year);
			if(student2Days!=0){
				if(student1Days>student2Days){
					System.out.println("No of days difference between two students date of birth is :"+(student1Days-student2Days));
				}
				else{
					System.out.println("No of days difference between two students date of birth is :"+(student2Days-student1Days));
				}
			}
			else{
				System.out.println("Date of birth of second student you entered is invalid so you are exited :");
			}

		}
		else{
			System.out.println("Date of birth of first student you entered is invalid so you are exited :");

		}
		


		
	}
}

