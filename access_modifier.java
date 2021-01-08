package access_modifier;

class MyClass{
	public int a=20;
	public int b=50;
	
}

class MyClass2 extends MyClass{
	
	private int c;
	
	void setVal(int n) {
		c=n;
	}
	
	int getval() {
		return c;
	}
	
}

class MyClass3 extends MyClass2{
	
	protected int d=30;
	
}

public class access_modifier {

	public static void main(String[] args) {
		
		MyClass m1 = new MyClass();
		System.out.println("Myclass ==> " + ((m1.a) + (m1.b)));
		
		MyClass2 m2 = new MyClass2();
        m2.setVal(15);
		System.out.println("Myclass2 ==> " + m2.getval());
		
		MyClass3 m3 = new MyClass3();
		System.out.println("Myclass3 ==> " + m3.d);

	}

}
