package kamlesh;

public class Employee{
	String name = "Kamlesh";
	int age = 28;
	String deptName = "QA Deptartment";
	
	void test(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(deptName);
	}
	
	void updateInfo(){
		age = 30;
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		e.test();
		e.updateInfo();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.deptName);	
	}
}


//Kamlesh
//28
//QA Deptartment
//Kamlesh
//30
//QA Deptartment