package Constructor_overloading;

class A{
	
	//class A constructor
	A(){
		System.out.println("I am in class A constructor");
	}
	
	A(int a){
		System.out.println("I am in class A overloaded constructor with value a= "+ a);
	}
	
}

class B extends A{
	
	//B class constructor
	B(){
		super(15);
		System.out.println("I am in class B constructor");
	}
	
	B(int a, int b){
		System.out.println("I am in class B overloaded constructor with value a and b= "+ a +" and " + b);
	}
	
		
}

class C extends B{
	
	//C class constructor
	C(){
		
		super(15,16);
		System.out.println("I am in class C constructor");
	}
	
	C(int a, int b,int c){
		
		System.out.println("I am in class B overloaded constructor with value a,b and c= "+ a +" and " + b + "and " + c);
	}
		
}
public class Constructor_overloading {

	public static void main(String[] args) {
          B b1 = new B();
          C c1 = new C();
	}

}
