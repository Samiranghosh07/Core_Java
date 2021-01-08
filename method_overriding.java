package method_overriding;

//method overriding
class A{
	
	public void meth1() {
		System.out.println("Hellow, I am method1 in class A with no arguments");
	}
	
	public void meth2(int x) {
		System.out.println(x*x); 
	}
}

class B extends A{
    
	@Override
	public void meth1() {
		System.out.println("Hellow, I am method1 in class B with no arguments");
	}
	
	@Override
	public void meth2(int x) {
		System.out.println(2*x*x); 
	}
}
public class method_overriding {

	public static void main(String[] args) {
		
		A a1 =  new A();
		a1.meth1();
		a1.meth2(4);
		
		B b1 = new B();
		b1.meth1();
		b1.meth2(5);
	}

}
