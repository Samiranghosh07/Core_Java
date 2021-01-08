package ap2;
import java.util.Arrays;

public class ap2 {

//	public static void main(String[] args) {
//		int a[] = {10,11,12,13,14,15,16};
//		reverse(a, a.length);
//	}
//	
//	static void reverse(int a[], int n)
//	{
//		int b[] = new int[n];
//		int j=n;
//		for(int i=0;i<n;i++) {
//			b[j-1]=a[i];
//			j--;
//		}
//		
//		System.out.println("Reverse array :");
//		for(int k=0;k<n;k++) {
//			System.out.println(b[k]);
//		}
//	}
	
	
//	public static void main(String[] args) {
//		// find max and min element from array
//		int a[] = {12,0,-56,456,100,-100};
//		int max=0;
//		int min=0;
//		for(int e:a) {
//			if(e>max) {
//				max=e;
//			}
//			else {
//				min=e;
//			}
//		}
//		System.out.print("\n Max Element : " + max);
//		System.out.print("\n Min Element : " + min);
//	}
	
	
//	public static void main(String [] args) {
//		int a[]= {12,-1,99,0,56,13,88,45};
//		Arrays.sort(a);
//		System.out.printf("\n Sorted array %s", Arrays.toString(a));
//	}
	
	public static void main(String [] args) {
		int a=5;
		f1(a);
		
	}
	
    static int f1(int a) {  //function declaration
    	a++;
    	System.out.println(a);
		return a;
    }
	

}
