package Inheritance;

//Inheritance
class Base{
	
	private int x;
	public int getX() {
		return x;
	}
	
	public void setX(int x1) {
		x=x1;
		
	}
}

class Derived extends Base{  //for java inheritance use extends keyword
	int y;
	public int getY() {
		return y;
	}
	
	public void setY(int y1) {
		y=y1;
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
//		Base b1 =new Base(); //base class object
//		b1.setX(100);
//		System.out.println("Value of X = " + b1.getX());
		
		Derived d1 =new Derived(); //derived class object
		d1.setX(100);
		d1.setY(200);
		System.out.println("Value of X = " + d1.getX());
		System.out.println("Value of Y = " + d1.getY());
	}

}
