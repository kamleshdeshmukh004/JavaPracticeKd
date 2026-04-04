//Write a program to print all numbers divisible by 4 from 1 to 50.

package for_loop;

public class Ex3 {
	
	void  numDIvisibleByFour() {
		for(int i=1; i<=50; i++) {
			if(i%4 == 0) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Ex3 example3 = new Ex3();
		example3.numDIvisibleByFour();
	}
}
