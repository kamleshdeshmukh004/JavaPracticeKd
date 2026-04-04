package kamlesh;

public class BankDetails{
	int balance = 5000;
	int dCount;
	int cCount;
	int pCount;
	
	void debitAmount(int amt){
		balance = balance - amt;
		dCount++;
	}
	
	void creditAmount(int amt){
		balance = balance + amt;
		cCount++;
	}
	
	void printBalance(){
		System.out.println("Remaining balance is Rs."+ balance + " only.");
		pCount++;
	}
	
	void count(){
		System.out.println("debitAmount:" + dCount + ", creditAmount:" + cCount + ", printBalance:" + pCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(500);
		bankDetails.debitAmount(1500);
		bankDetails.printBalance();
		bankDetails.creditAmount(3000);
		bankDetails.debitAmount(200);
		bankDetails.printBalance();
		bankDetails.count();
		
	}
}



//Remaining balance is Rs.3000 only.
//Remaining balance is Rs.5800 only.
//debitAmount:3, creditAmount:1, printBalance:2