//Write a program with a method to print numbers from 10 to 1 (reverse order) using a for loop.
package for_loop;

public class Ex4 {

	void printNum(){
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		ex4.printNum();
	}
}
