package Inheritance2;

class Rectangle{
	
	int length, breadth;
	public int getArea(int l, int b) {
	    this.length=l;
		this.breadth=b;
		return (l*b);
	}
	
	public int getPeri(int l, int b) {
		return 2*(l+b);
	}
	
}


class OnlyDisplay extends Rectangle{
	
	public void notifyMe() {
		System.out.println("Hello, I am in OnlyDisplay class");

	}
     
}

public class Inheritance2 {

	public static void main(String[] args) {
		
//		Rectangle r1 = new Rectangle();
//		System.out.println("Area of Rectangle :" + r1.getArea(4,5));
//		System.out.println("Perimeter of Rectangle :" + r1.getPeri(8,7));
		
		OnlyDisplay o1 = new OnlyDisplay();
		int a1 = o1.getArea(4, 5);
		int a2 = o1.getPeri(8, 7);
		o1.notifyMe();
		System.out.println("Area of Rectangle :" + a1);
		System.out.println("Perimeter of Rectangle :" + a2);
	
	}

}
