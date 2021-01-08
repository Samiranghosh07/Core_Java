package varargs;

public class varargs {

//	static int sum(int a, int b, int c) {
//		return (a+b+c);
//	}
	
//	static int sum(int ...arr) {
//		int result =0;
//		for(int e:arr) {
//			result = result + e;
//		}
//		return result;
//	}
//	
//	public static void main(String [] args) {
//		System.out.println("Welcome to variable arguments");
//		System.out.println("No arguments "   + sum());
//		System.out.println("With arguments " + sum(4,5,5));
//		System.out.println("With arguments " + sum(4,5,5,10,12,13));
//		System.out.println("With arguments " + sum(10,20,30,40,50,60,70,80,90,100));
//	}
	
	//calculate factorial number
	
//	static int fact(int n) {
//		int f=1;
//		for(int i=1;i<=n;i++) {
//			f=f*i;
//		}
//		return f;
//	}
//
//	public static void main(String [] args) {
//		
//		int x=5;
//		System.out.println("The factorial number : " + fact(x));
//	}
	
	//calculate fibonacci number
	
//	static int fibo(int n) {
//		if(n<=1)
//			return n;
//		else
//			return fibo(n-1) + fibo(n-2);
//	}
//	
//	public static void main(String [] args) {
//		int x=10;
//			System.out.println("Fibonacci number");
//			for(int i=0;i<x;i++) {
//				System.out.print(fibo(i)+ " ");
//			}
//			
//		
//	}
	
//	static int starPyramid(int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		return n;
//	}
//	
//	public static void main(String [] args) {
//		int n=5;
//		starPyramid(n);
//	}
	
//	sum of n natural numbers
//	
//	static int sumOfn(int n) {
//		if(n<=1)
//			return n;
//		else
//			return n + sumOfn(n-1);
//	}
//	
//	public static void main(String [] args) {
//		
//		int x=10;
//		if(x<0)
//			System.out.println("Number should be positive");
//		else
//			System.out.println("Sum of N (natural number) " + sumOfn(x));
//		    
//	}
	
	
//	static void starPyramid2(int n) {
//		if(n>0) {
//			starPyramid2(n-1);
//			for(int i=0;i<n;i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String [] args) {
//		int n=5;
//		starPyramid2(n);
//	}
}
