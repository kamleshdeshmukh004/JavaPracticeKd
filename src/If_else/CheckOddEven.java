package If_else;

public class CheckOddEven {
	
	void verifyOddEven(int num) {
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		
		CheckOddEven c = new CheckOddEven();
		c.verifyOddEven(10);
	}
}
