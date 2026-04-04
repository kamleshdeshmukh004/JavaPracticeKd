package kamlesh;

/*If debit operation perform successfully, then print "Debit operation for amount 100 rs successfully."
otherwise print, "InSufficient balance, user requested 100 rs, current balance 50 rs.";
if user could debit successfully then only consider it in debitCount.
If credit amt is more than 5000 rs, tell user "Maximum credit amount should be equal or less than 5000.".
if credit amt is less or equal 5000 rs, then show success message "2000 rs successfully credited". in that case increment creditCount value.
Diplay method should print, how many times debit and credit operation performed and current balance.

output :
Debit operation for amount 2000 rs successfully.
InSufficient balance, user requested 1500 rs, current balance 1000 rs.
Maximum credit amount should be equal or less than 5000.
4500 rs successfully credited.
Debit operation for amount 1000 rs successfully.
debit Operation = 2, credit Operation = 1, current balance = 4500.*/

public class BankInfo{
	int balance = 3000;
	int maxCreditAmt = 5000;
	int dCount;
	int cCount;
	
	void debitAmt(int amt){
		if(balance >= amt){
		balance = balance - amt;
		System.out.println("Debit operation for amount "+ amt +" rs successfully." );
		dCount++;
		}else{
			System.out.println("InSufficient balance, user requested " + amt + " rs, current balance is "+balance+" Rs.");
		}
		
	}
	
	void creditAmt(int amt){
		if(amt >= maxCreditAmt){
			System.out.println("Maximum credit amount should be equal or less than "+ maxCreditAmt +" Rs.");
		}else{
			balance = balance + amt;
			System.out.println(amt+ " rs credited successfully.");
			cCount++;
		}
	}
	
	void printCount(){
		System.out.println("Debit Operation="+dCount+", Credit Operation="+cCount+", Current Balance=Rs "+balance+ ".");
	}
	
	public static void main(String[] args){
		BankInfo bankInfo = new BankInfo();
		bankInfo.debitAmt(2000);
		bankInfo.debitAmt(1500);
		bankInfo.creditAmt(6000);
		bankInfo.creditAmt(4500);
		bankInfo.debitAmt(1000);
		bankInfo.printCount();
	}
}


