/*
 * 1.
Write a program for following functionalities
1.Create a class Student having properties id, name and percentage
2. Creating a Directory named Students in that directory create a file.
3. Add students data into the file. Add at least 4 students
4. Read the file and display student data.
5. Add one more student into the file.
6. Delete the student data of id 2.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable{
	String id,name;
	float percntage;
	public Student(String id, String name, float percntage) {
		super();
		this.id = id;
		this.name = name;
		this.percntage = percntage;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPercntage() {
		return percntage;
	}
	
}
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		File f=new File("students");
		if(!f.exists()){
			f.mkdir();
		}
		FileOutputStream fw =new FileOutputStream("students/studentDetails.ser");
		ObjectOutputStream out=new ObjectOutputStream(fw);
		System.out.println("Enter the number of students desired  to enter into the file :");
		int number=sc.nextInt();
		Student s[]=new Student[number];
		for(int i=0;i<number;i++){
			System.out.println("Enter the id of the "+(i+1)+" student");
			String id=sc.next();
			System.out.println("Enter the name of the "+(i+1)+" student");
			String name=sc.next();
            System.out.println("Enter the percentage of the "+(i+1)+" student");
            float percentage=sc.nextFloat();
            s[i]=new Student(id, name, percentage);

		}
		out.writeObject(s);
		System.out.println("Details of all the students Entered into file :");
		fw.close();
		out.close();
		FileInputStream fin =new FileInputStream("students/studentDetails.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student[] s1=(Student[])oin.readObject();
        fin.close();
        oin.close();
		System.out.println("Adding one Extra student into the file please fill the details :");
		System.out.println("Enter the id of the "+(number+1)+" student");
		String id=sc.next();
		System.out.println("Enter the name of the "+(number+1)+" student");
		String name=sc.next();
        System.out.println("Enter the percentage of the "+(number+1)+" student");
        float percentage=sc.nextFloat();
        Student stu=new Student(id, name, percentage);
        Student[] s2=new Student[s1.length+1];
        for(int i=0;i<s1.length;i++)
        	s2[i]=s1[i];
        s2[s1.length]=stu;
        for(int i=0;i<s2.length;i++){
        	System.out.println(s2[i].name);
        }
        fw =new FileOutputStream("students/studentDetails.ser");
        out=new ObjectOutputStream(fw);
        out.writeObject(s2);
        fw.close();
        out.close();
        System.out.println("Enter the id to delete the Object :");
        id=sc.next();
        fin =new FileInputStream("students/studentDetails.ser");
        oin = new ObjectInputStream(fin);
         s1=(Student [])oin.readObject();
         fin.close();
         oin.close();
         s2=new Student[s1.length-1];
         int count=-1;
         for(int i=0;i<s1.length;i++){
        	 if(!(s1[i].getId().equals(id))){
        		 s2[++count]=s1[i];
        	 }
        	 else{
        		 System.out.println("Object of the particular Id is deleted :");
        	 }
         }

         fw =new FileOutputStream("students/studentDetails.ser");
         out=new ObjectOutputStream(fw);
         out.writeObject(s2);
         fw.close();
         out.close();
	}

}
