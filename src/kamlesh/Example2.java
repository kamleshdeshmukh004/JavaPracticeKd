package kamlesh;

public class Example2{
	int num1= 10;
	int num2= 20;
	
	void updateData(){
		num1 = num1 + num2;
	}
	
	void processData(){
		num1 = num1/5;
	}
	
	void display(){
		if(num1 == num2){
			System.out.println("hi");
		}
		System.out.println("hello");
		if(num1 > num2){
			System.out.println("Pune");
		}else{
			System.out.println("Mumbai");
		}
		System.out.println("Delhi");
	}
	
	public static void main(String[] args){
		Example2 example2 = new Example2();
		example2.updateData();
		example2.processData();
		example2.display();
	}
}



//hello
//Mumbai
//Delhi
