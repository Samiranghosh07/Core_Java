package thissuper;

//usage of this keyword and super()

class A{
	
	A(int a,int b){
		System.out.println(" A constructor");
		System.out.println(" Addition of numbers :" + (a+b));
	}
	
	int a;
	int getA() {
		return a;
	}
	
	void setA(int a) {
		this.a=a;
	}
	
	int testA(int x, int y) {
		return (x+y);
	}
	
}

class B extends A{
	
	B(){
		super(5,6);
		System.out.println(" B constructor");
	}
	
	int b;
	int getB() {
		return b;
	}
	
	void setB(int b) {
		this.b=b;
	}
}


public class thissuper {

	public static void main(String[] args) {
	
       B b1=new B(); //call A and B constructor

	}

}
