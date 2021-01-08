package box_constructor;

class Box
{
	double width, height, depth;
	Box(double w, double h, double d)// constructor name, same as class name
	{
		this.width=w;  //this keyword refers the current object
		this.height=h;
		this.depth=d;
	}
	
	double calulation()
	{
		return (width * height * depth);
	}
	
}
public class box_constructor {

	public static void main(String[] args) 
	{
		double volume;
		Box b1 = new Box(56,88,23);
		volume= b1.calulation();
		System.out.println("Result : " + volume);
	}

}
