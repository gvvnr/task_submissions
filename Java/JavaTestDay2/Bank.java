import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Account implements Serializable{
	String accountNumber;
	String accountHolderName;
	String accountHolderAddress;
	float accountHolderBalance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}
	public void setAccountHolderBalance(float accountHolderBalance) {
		this.accountHolderBalance = accountHolderBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
	public float getAccountHolderBalance() {
		return accountHolderBalance;
	}
	
	
}
class SavingsAccount  extends Account{
	public void addBalance(float balance) {
		accountHolderBalance+=balance;

	}
	public void displayBalance(float totalBalance){
		System.out.println("Account holders total balance is :"+totalBalance);
	}
	public void withDrawAmount(float amount){
		try{
			if(accountHolderBalance<amount){
				throw new MyException("Insufficient balance :");
			}
			else{
				accountHolderBalance-=amount;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	
}
public class Bank{
	ArrayList<Account> accountsList;
	Scanner sc;
	Iterator itr;
	Bank(){
		accountsList=new ArrayList();
		sc=new Scanner(System.in);
	}
	public void addAccounts(){
		System.out.println("Enter the number of accounts to be added :");
		int accounts=sc.nextInt();
		for(int i=0;i<accounts;i++){
			SavingsAccount account=new SavingsAccount();
			System.out.println("Enter the account number :");
			account.setAccountNumber(sc.next());
			System.out.println("Enter the account holder name :");
			account.setAccountHolderName(sc.next());
			System.out.println("Enter the account holder address :");
			account.setAccountHolderAddress(sc.next());
			System.out.println("Enter the account holder balance :");
			account.setAccountHolderBalance(sc.nextFloat());
			accountsList.add((Account)account);
		}
		
	}
	public void operations(){
		itr=accountsList.iterator();
		while(itr.hasNext()){
			SavingsAccount account=(SavingsAccount) itr.next();
		    System.out.println("Details of account number :"+account.getAccountNumber());
			
		    int exit;
		    do{
		    	System.out.println("Enter 0 to go to next account if exist");
		    	System.out.println("Enter 1 to add balance :");
		    	System.out.println("Enter 2 to display balance :");
		    	System.out.println("Enter 3 to withDraw Balance :");
		    	exit=sc.nextInt();
		    	switch(exit){
		    	case 1:
		    		System.out.println("Enter the amount to be added :");
		    		account.addBalance(sc.nextFloat());
		    		break;
		    	case 2:
		    		account.displayBalance(account.getAccountHolderBalance());
		    		break;
		    	case 3:
		    		System.out.println("Enter the amount to be with drawn :");
		    		account.withDrawAmount(sc.nextFloat());
		    		break;
		    	}
		    	
		    }while(exit!=0);
		    
		    //account.withDrawAmount(sc.nextFloat());
		}
	}
	public void storeDataInFile() throws IOException{
		FileOutputStream fout=new FileOutputStream("Bank.ser");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(accountsList);
		out.close();
		fout.close();
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		bank.addAccounts();
		bank.operations();
		bank.storeDataInFile();
		
	}
	

}
class MyException extends Exception{
	MyException(String raisedException){
		super(raisedException);
	}
}
