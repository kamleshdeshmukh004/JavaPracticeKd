//Write a program with a method to print all numbers from a user-defined range (start to end) in reverse order.
package for_loop;

public class Ex5 {

	void printNum(int start, int end) {
		for(int num=end; num>=start; num--) {
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		ex5.printNum(11, 20);
	}
}
