package classobject; 

class myClass {
	
	public int Addition(int a, int b) {
		 return (a+b);
	}
	
}

class Employee{
	int eid;
	String ename;
	
	public void display() {
		System.out.println("Employee Details :");
		System.out.println("employee id :" + eid);
        System.out.println("employee name : " + ename);
	}
}

public class classobject {

	public static void main(String[] args) {
		
		int a=56; int b=66;
		int r;
		myClass obj1  = new myClass();
		r=obj1.Addition(a,b);
        System.out.println("Result :" +r);
        
        Employee e1 = new Employee();
        e1.eid = 4562389;
        e1.ename = "jackson brown";
        e1.display();
        System.out.println();
        
        Employee e2 = new Employee();
        e2.eid = 999999;
        e2.ename = "Thomas hank";
        e2.display();
        System.out.println();
  
        Employee e3 = new Employee();
        e3.eid = 4545123;
        e3.ename = "daniel roster";
        e3.display();
        
	}

}


