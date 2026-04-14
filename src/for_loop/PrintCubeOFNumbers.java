//Write a program with a method to print the cube of numbers in a user-defined range.
package for_loop;

public class PrintCubeOFNumbers {
	
	void printCube(int a, int b) {
		System.out.println("Correct order");
		for(int i=a; i<=b; i++) {
			
			System.out.println(i*i*i);
			
		}
		System.out.println("=================");
		System.out.println();
		System.out.println("Reverse order");
		
		for(int i=b; i>=a; i--) {
			System.out.println(i*i*i);
		}
		System.out.println("=================");
	}
	

	public static void main(String[] args) {
		
		PrintCubeOFNumbers pc = new PrintCubeOFNumbers();
		pc.printCube(0, 5);
	}

}
