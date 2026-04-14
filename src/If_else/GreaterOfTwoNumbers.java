package If_else;

public class GreaterOfTwoNumbers {

	void checkNum(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is grater than "+ num2);
		}else if(num2 > num1) {
			System.out.println(num2 + " is grater than "+num1);
		}else {
			System.out.println("Both numbers are equal.");
		}
	}
	
	
	
	public static void main(String[] args) {
	
		GreaterOfTwoNumbers g = new GreaterOfTwoNumbers();
		g.checkNum(5, 10);
		g.checkNum(5, 5);
		g.checkNum(25, 15);
		
	}

}
