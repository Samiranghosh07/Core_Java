package ifelse;
import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
//		int a=56, b=25, c=100;  // calculate maximum number between three numbers
//		if(a>b)
//		{
//			if(c>b)
//			{
//				System.out.println("C is greater" + c);
//			}
//			else
//			{
//				System.out.println("b is greater" + b);
//			}
//		}
//		else
//		{
//			System.out.println("b is greater" + b);
//		}
//	}
		
		int marks;  // if-else ladder system
		Scanner s1=new Scanner(System.in);
		System.out.println("\n enter marks :");
		marks=s1.nextInt(); 
		
		if(marks>=90)
			System.out.println("\n Garde is A");
		else if(marks>=80)
			System.out.println("\n Grade is B");
		else if(marks>=70)
			System.out.println("\n Grade is C");
		else if(marks>=50)
			System.out.println("\n Grade is E");
		else if(marks<50)
			System.out.println("\n Grade is F");
		else
			System.out.println("\n Grade is B");
			
	}	
	}
