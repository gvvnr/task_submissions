class BankTransactions{
	static double  money;
	
	public static void withDrawMoney(){
		money-=50;
		System.out.println("Money with drawn total money is :"+money);
	}
	public static void depositMoney() {
		money+=50;
		System.out.println("Money deposited total money is :"+money);

	}
}
class Depositer implements Runnable{

	public void run() {
		int i=0;
		while(i<10){
			BankTransactions.depositMoney();
			i++;
		}
		// TODO Auto-generated method stub
		
	}
	
}
class WithDrawer implements Runnable{

	public void run() {
		int i=0;
		while(i<10){
			BankTransactions.withDrawMoney();
			i++;
		}
		// TODO Auto-generated method stub
		
	}
	
}

public class MultiThread extends Thread {
	public static void main(String[] args) {
		Depositer d=new Depositer();
		Thread t=new Thread(d);
		t.start();
		WithDrawer w=new WithDrawer();
		Thread t1=new Thread(w);
		t1.start();
	}

}
