package room;

class Room
{
	float length;
	float breadth;
	
	void getdata(float a, float b)
	{
		length=a;
		breadth=b;
	}
}

class RoomArea
{
	public static void main(String args[])
	{
		float area;
		Room r1=new Room();
		r1.getdata(15,16);
		area=r1.length * r1.breadth;
		System.out.println("Area of Room :: " + area);
	}
}
