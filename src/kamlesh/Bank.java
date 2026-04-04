package kamlesh;

public class Bank{
	int balance = 5000;
	
	void debitAmount(int amt){
		balance = balance - amt;	
	}
	
	void creditAmount(int amt){
		balance = balance + amt;
	}
	
	void printBalance(){
		System.out.println("Remaining balance is Rs."+ balance + " only.");
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(500);
		bankDetails.debitAmount(1500);
		bankDetails.printBalance();
		bankDetails.creditAmount(3000);
		bankDetails.debitAmount(200);
		bankDetails.printBalance();

	}
	
}



//Remaining balance is Rs.3000 only.
//Remaining balance is Rs.5800 only.