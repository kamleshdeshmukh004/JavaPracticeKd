//Write a program to print all odd numbers from 1 to 100 using a for loop.

package for_loop;

public class Ex2 {
	void printOddNum() {
		for(int i=0; i<=100; i++) {
			if(i%2 == 1) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Ex2 example2 = new Ex2();
		example2.printOddNum();
	}
}
