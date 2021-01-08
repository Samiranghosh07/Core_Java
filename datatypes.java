package datatypes;
import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {   // declaration of primitive data types
//		int a=5;
//		System.out.println("a ="+ a);
//		char c='H';
//		System.out.println("c ="+ c);
//        String s1="hello world";
//        System.out.println("s1 ="+ s1);
//        float b=5;
//        System.out.println("b ="+ b);
//        int a1=15,a2=20,a3=13;
//        int s=(a1+a2+a3);
//        System.out.println("s ="+ s);
		
//		int a=51;
//		double b;
//		b=(double)a; //type casting
//		System.out.println(b);
        
		
	    //taking input from user
		
		int a,b;
		System.out.println("\n enter first number");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("\n enter second number");
		b=s1.nextInt();
        int s=a+b;
        System.out.println("\n sum = " + s);
	}

}
