//Write a program with a method to print the square of numbers from 1 to 10.

package for_loop;

public class PrintSquareOfNumbersFrom_1to10 {
	
	void printSquare(int start, int end) {
		for(int i=start; i <= end; i++) {
			System.out.println(i*i);
		}
	}

	public static void main(String[] args) {
		
		PrintSquareOfNumbersFrom_1to10 p = new PrintSquareOfNumbersFrom_1to10();
		p.printSquare(1, 10);

	}

}
