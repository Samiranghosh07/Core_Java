package ExceptionHandling;
import java.lang.Exception;

class MyException extends Exception{
	
	MyException(String message){
		super(message);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		
//		int a=10;
//		int b=5;
//		int c=5;
//		int x = a/(b-c);
//		int y = a/(b+c);
//		System.out.println("Result of x = " +  x);
//		System.out.println("Result of y = " +  y);
		
//		int a =10, b=5, c=5, x,y;
//		try {
//			x=a/(b-c);
//		}
//	    catch(ArithmeticException e) {
//	    	System.out.println("Division by zero not allowed");
//	    }
//		finally {
//			System.out.println("welcome to java EH");
//		}
//		y=a/(b+c);
//		System.out.println("result of y = " + y);
		
//		int invalid =0, n, c=0;
//		for(int i=0; i<args.length; i++) {
//			try {
//				n = Integer.parseInt(args[i]);
//			}
//			catch(NumberFormatException e) {
//				invalid = invalid +1;
//				System.out.println("Invalid Number: " + args[i]);
//				continue;
//			}
//			c=c+1;
//		}
//		System.out.println("valid Number: " + c);
//		System.out.println("Invalid Number: " + invalid);
		
		
//		int a[] = {5,10},x,y,b=5;
//		try {
//			x = a[1] / (b - a[0]);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Division by zero not accepted");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index ERROR");
//		}
//		catch(ArrayStoreException e) {
//			System.out.println("A wrong data type");
//		}
//		
//		y = a[1] / a[0];
//		System.out.println("y = " + y);
		
		//user defined exception
		int x=5, y=10000;
		try {
			float z = (float) x / (float) y;  // type casting
			if(z < 0.01)
			{
				throw new MyException("number is too small");
			}
		}
		catch(MyException e) {
			System.out.println("Caught my exception");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am always here");
		}
	}

}
