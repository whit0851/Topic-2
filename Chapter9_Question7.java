import java.util.*;
public class Chapter9_Question7 {

	public static void main(String[] args) {
		Account newAccount = new Account (1122, 20000);
		newAccount.setannualInterestRate(4.5);
		newAccount.setbalnancewithdraw(2500);
		newAccount.setbalnancedeposit(3000);
		System.out.print("The balance on the account is $" + newAccount.getbalance() + ", the monthly interest is $" + newAccount.getMonthlyInterest() + " and the date the account was created was " + newAccount.getdateCreated());

	}

}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	Account(int newid, double newbalance){
		id = newid;
		balance = newbalance;
	}
		int getid(){
			return id;
	}
		double getbalance(){
			return balance;
	}
		double getannualInterestRate(){
			return annualInterestRate;
	}
		Date getdateCreated(){
			return dateCreated;
	}
		public void setid(int newid){
			id = newid;
	}
		public void setbalance(double newbalance){
			balance = newbalance;
	}
		public void setannualInterestRate(double newannualInterestRate){
			annualInterestRate = newannualInterestRate;
	}
		double getMonthlyInterestRate(){
			return annualInterestRate/(12*100);
	}
		double getMonthlyInterest(){
			return balance*(annualInterestRate/(12*100));
	}
		public void setbalnancewithdraw(double wnewbalance){
			balance = balance - wnewbalance;
	}
		public void setbalnancedeposit(double dnewbalance){
			balance = balance + dnewbalance;
	}
}
