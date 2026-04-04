package kamlesh;

public class Calculator{
	
	void sum(int a, int b, int c){
		int d = a + b + c;
		System.out.println("Addition is "+ d);
	}
	
	void sub(int x, int y){
		int z = x - y;
		System.out.println("Subtraction is "+ z);
	}
	
	void multi(int p, int q){
		int r = p * q;
		System.out.println("Multiplication is "+ r);
	}
	
	void div(int m, int n){
		
		System.out.println("Division is "+ 0);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.sum(10,20,30);
		calculator.sub(10,10);
		calculator.multi(10,10);
		calculator.div(10,10);
	}
}



//Addition is 60
//Subtraction is 0
//Multiplication is 100
//Division is 0