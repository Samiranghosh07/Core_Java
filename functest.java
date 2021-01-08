package functest;

public class functest {

//	public static void main(String[] args) {
//		int x,y,z;
//		x=10;
//		y=20;
//		z=30;
//		function(x,y,z);
//
//	}
//	
//	static int function(int a, int b, int c) {
//		int s= 20;
//		if(a>b) {
//			s=s+a;
//			System.out.printf("s=%d when a=%d",s,a);
//		}
//		else if(b>c) {
//			s=s+b;
//			System.out.printf("s=%d when b=%d",s,b);
//		}
//		else
//		{
//			s=s+c;
//			System.out.printf("s=%d when c=%d",s,c);
//		}
//		return s;
//	}

//	static void change1(int a) {
//		a=98;
//	}
//	
//	static void change2(int a[]) {
//		a[0]=303;
//	}
//	
//	public static void main(String [] args) {
//	    int a=101; 
//	    change1(a);
//		int a[] = {10,20,30,40,50,60};
//		change2(a);
//	    System.out.println(a[0]);
//	    System.out.println(a[1]);
//	    System.out.println(a[2]);
//	    System.out.println(a[3]);
//	    System.out.println(a[4]);
//	    System.out.println(a[5]);
//	}

	//method overloading ==> same function name with different activity
	
	public static void main(String [] args) {
		
		f1();
		f1(50);
		f1(50,60);
	}
	
	static void f1() {
		System.out.println("I am in function1");
	}
	
	static void f1(int a) {
		System.out.println("I am in function1 with value a = " + a);
	}
	
	static void f1(int a, int b) {
		System.out.println("I am in function1 with value a and b " + (a+b));
	}
	
	
}
