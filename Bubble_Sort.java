package Bubble_Sort;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int temp=0;
		int a[] = {89,5,101,0,-12,6,-81,100};
		int n= a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) 
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}		
		}
		System.out.println("Bubble Sort");
	    for(int items : a) {
	    	
	    	System.out.print(items+" ");
	    }

	}
}
