import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class StudentMarks {
	FileReader file;
	BufferedReader br;
	FileWriter fw;
	BufferedWriter bw;
	int count;
	float average[];
	float percentage[];
	String data;
	public StudentMarks() throws IOException {
		// TODO Auto-generated constructor stub
		file=new FileReader("student1.csv");
		br=new BufferedReader(file);
		average=new float[6];
		percentage=new float[6];
		data="";
		
		
	}
	public void readData() throws IOException{
		String rowLine;
		int rowcount=0;
		while((rowLine=br.readLine())!=null && rowLine.length()!=0){
			//while((str=input.readLine())!=null && str.length()!=0)
			//rowLine=br.readLine();
			if(count==0){
				data=data+rowLine+",average,percentage"+"\n";
				
			}
			else if(count>=1){
				data=data+rowLine;
				String words[]=rowLine.split(",");
				int singleAverage=0,singlePercentage=0;
				for(int index=3;index<=8;index++){
					singleAverage+=Integer.parseInt(words[index]);
				}
				singlePercentage=(singleAverage*100)/600;
				singleAverage=singleAverage/6;
				data=data+","+singleAverage+","+singlePercentage+","+"\n";
				
			}
			++count;
			
		}
		br.close();

		file.close();
		
	}
	private void writeData() throws IOException {
		// TODO Auto-generated method stub
		fw=new FileWriter("student1.csv");
		bw=new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		fw.close();

	}
	
	public static void main(String[] args) throws IOException {
		StudentMarks studentDetails=new StudentMarks();
		studentDetails.readData();
		studentDetails.writeData();
	}

}
