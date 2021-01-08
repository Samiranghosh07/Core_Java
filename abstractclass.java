package abstractclass;

class Parent{
	
	public void method1() {
		System.out.println("Hello, Parent class");
	}
}

class Base1 extends Parent{
	
	@Override
	public void method1() {
		System.out.println("Hello, Base1 class");
	}
}

abstract class Base2 extends Parent{
	
	abstract void method2();
}

public class abstractclass {

	public static void main(String[] args) {
		
		Base1 b1 =  new Base1();
		b1.method1();
		
		Parent p1 = new Parent();
		p1.method1();
		
	}

}
