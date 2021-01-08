package testInheri;
import java.math.*;

//class Circle{
//    	
//	int r;
//	public void getArea(int radius) {
//		r=radius;
//		System.out.println("Area of Circle : " + (Math.PI * r *r));
//	}
//	
//	public void getPeri() {
//		System.out.println("Perimeter of Circle : " +(2* r * r));
//	}
//}
//
//class Rectangle extends Circle{
//	
//	int breadth, height;
//	public void getRArea(int b, int h) {
//		breadth = b;
//		height = h;
//		System.out.println("Area of Rectangle : " + (breadth * height));
//	}
//	
//	public void getRPeri() {
//		System.out.println("Perimeter of Rectangle : " + (breadth + height));
//	}
//}


class Base{
	Base(){
		
		System.out.println("Hello Base Class");
	}
}
class Derived1 extends Base{
	Derived1(){
		System.out.println("Hello Derived1 Class");
	}
}

class Derived2 extends Derived1{
	Derived2(){
		System.out.println("Hello Derived2 Class");
	}
}
public class testInheri {

	public static void main(String[] args) {
		
//		Rectangle r1 = new Rectangle();
//		r1.getArea(5);
//		r1.getPeri();
//		
//		r1.getRArea(15,16);
//		r1.getRPeri();
		
		Derived2 obj = new Derived2();

	}

}
