package kamlesh;

public class Example3
{
	int a =10;
	int b = 20;
	
	void test(){
		int a = 15;
		System.out.println(a+b);
	}
	
	void demo(){
		a=5;
	}
	
	void demo1(){
		System.out.println(a-b);
	}
	
	public static void main(String[] args){
		Example3 example3 = new Example3();
		example3.test();
		example3.demo();
		example3.demo1();
	}
}

