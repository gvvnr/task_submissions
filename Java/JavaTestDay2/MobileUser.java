import java.util.Scanner;

interface Sim{
	public void sendSms(String message,String mobileNo);
	public void dailACall(String mobileNo);
	
}
class Airtel implements Sim{
	

	@Override
	public void sendSms(String message, String mobileNo) {
		// TODO Auto-generated method stub
		System.out.println(message+" is the Message sent from airtel to the mobileNumber:"+mobileNo);
		
	}

	@Override
	public void dailACall(String mobileNo) {
		System.out.println("Called  to :"+mobileNo+"from airtel sim");
		// TODO Auto-generated method stub
		
	}
	
}
class BSNL implements Sim{
	

	@Override
	public void sendSms(String message, String mobileNo) {
		System.out.println(message+" is the Message sent from BSNL to the mobileNumber:"+mobileNo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dailACall(String mobileNo) {
		System.out.println("Called to "+mobileNo+" from BSNL sim");
		
		// TODO Auto-generated method stub
		
	}
	
}
class Vodafone implements Sim{
	

	@Override
	public void sendSms(String message, String mobileNo) {
		System.out.println(message+" is the Message sent from Vodafone to the mobileNumber:"+mobileNo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dailACall(String mobileNo) {
		System.out.println("Called to "+mobileNo+" from Vodafone sim");
		// TODO Auto-generated method stub
		
	}
	
}
class Mobile{
	Scanner scanner,scanner1;
	Sim sim;

	Mobile(){
		scanner=new Scanner(System.in);
		scanner1=new Scanner(System.in);

	}
	public void insertSim(Sim sim) {
		this.sim=sim;
	}
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Enter the message to send :");
		String message=scanner1.nextLine();
		System.out.println("Enter the mobile number to send message :");
		String mobileNo=scanner.next();
		sim.sendSms(message, mobileNo);

	}
	public void dialACall() {
		// TODO Auto-generated method stub
		System.out.println("Enter the mobile number to dial a call :");
		String mobileNo=scanner.next();
		sim.dailACall(mobileNo);
		

	}
	public int chooseSim() {
		// TODO Auto-generated method stub
		 System.out.println("Enter 1 to choose Airtel :");
		 System.out.println("Enter 2 to choose BSNL :");
		 System.out.println("Enter 3 to choose Vodafone :");
		 return scanner.nextInt();
		 

	}
}
public class MobileUser {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 Mobile microMax=new Mobile();
		int chooseSim=microMax.chooseSim();
		 if(chooseSim==1){
			 Sim sim=new Airtel();
			 microMax.insertSim(sim);
			 microMax.dialACall();
			 microMax.sendSMS();
			 
		 }else if(chooseSim==2){
			 Sim sim=new BSNL();
			 microMax.insertSim(sim);
			 microMax.dialACall();
			 microMax.sendSMS();
			 
		 }else if(chooseSim==3){
			 Sim sim=new Vodafone();
			 microMax.insertSim(sim);
			 microMax.dialACall();
			 microMax.sendSMS();
			 
		 }else{
			 System.out.println("you entered a wrong sim number to choose");
		 }
		 System.out.println("Thank you you are exited :");
		 
		
	}

}
