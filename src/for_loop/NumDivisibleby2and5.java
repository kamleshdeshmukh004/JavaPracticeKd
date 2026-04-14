//Write a program to print all numbers from 1 to 100 that are divisible by both 2 and 5.
package for_loop;

public class Ex6 {

	void printNum() {
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		ex6.printNum();
	}
}
