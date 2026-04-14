package If_else;

public class CheckPositiveOrNegative {

	void checkNumber(int num) {
		if(num > 0) {
			System.out.println(num+" is Positive number.");
		}else if (num < 0) {
			System.out.println(num+ " is Negative number.");
		}else {
			System.out.println(num+" is Neutral number.");
		}
	}
	
	public static void main(String[] args) {
		
		CheckPositiveOrNegative c = new CheckPositiveOrNegative();
		c.checkNumber(0);
		c.checkNumber(15);
		c.checkNumber(-2);
	}

}
